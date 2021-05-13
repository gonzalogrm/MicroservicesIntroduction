package com.zalost.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.reactive.function.client.WebClient;

import com.zalost.model.*;
import com.zalost.persistence.UserCollectionRepository;
import com.zalost.persistence.UserRepository;

@RestController 
@RequestMapping("/booklist")
public class BookListService {
	
	private String bookRatingsPath = "http://localhost:8081/bookratings/ratings/";
	private String bookDataPath = "http://localhost:8082/bookdata/data/";
	
	@Autowired
	private WebClient.Builder webClientBuilder;	
	@Autowired
	private UserRepository userDAO;	
	@Autowired
	private UserCollectionRepository userCollectionDAO;
	
	//REST: get all (GET)
	@GetMapping("/users")
	public List<User> findAllUsers(){
		return userDAO.findAll();
	}		
	
	//REST: get user by ID (GET)
	//@PathVariable: Annotation which indicates that a method parameter 
	//should be bound to a URI template variable.
	@GetMapping("/users/{id}")
	public List<Book> getUserByID(@PathVariable int id) {
		//Es un Optional<T>
		Optional<User> u = userDAO.findById(id);
		//Si está presente lo devolvemos
		if(u.isPresent()){			
			//Usuario encontrado
			User user = u.get();
			
			//Buscamos libros de la colección del usuario
			List<UserCollection> uc = userCollectionDAO.findAll();
			
			//Sólo mostramos aquellos libros que pertenecen al usuario
			List<Book> books = new ArrayList<Book>();
			for (UserCollection userCollection : uc) {
				if(userCollection.getIduser() == user.getIduser()) {
					//Buscar BookData
					BookData bd = webClientBuilder.build().get().uri(
							bookDataPath+userCollection.getIdbook())
							.retrieve().bodyToMono(BookData.class).block();
					//Buscar BookRating
					BookRating br = webClientBuilder.build().get().uri(
						bookRatingsPath+userCollection.getIdbook())
						.retrieve().bodyToMono(BookRating.class).block();
					//Unir las partes
					books.add(new Book(userCollection.getIdbook(), bd,br));
				}
			}		
		    return books;
		}
		//Si no, return null
		else{
		    return null;
		}
	}
	
	/*
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserByID(@PathVariable int id) {
		//Es un Optional<T>
		Optional<User> u = userDAO.findById(id);
		//Si está presente lo devolvemos
		if(u.isPresent()){
		    return ResponseEntity.ok(u.get());
		}
		//Si no, return null
		else{
		    return null;
		}
	}
	*/
}
