package com.zalost.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zalost.model.BookRating;
import com.zalost.persistence.BookRatingRespository;

@RestController 
@RequestMapping("/bookratings")
public class BookRatingService {
	@Autowired
	private BookRatingRespository ratingDAO;
	
	//REST: get all (GET)
	@GetMapping("/ratings")
	public List<BookRating> findAll(){
		return ratingDAO.findAll();
	}		
	
	//REST: get user by ID (GET)
	//@PathVariable: Annotation which indicates that a method parameter 
	//should be bound to a URI template variable.
	@GetMapping("/ratings/{id}")
	public ResponseEntity<BookRating> getByID(@PathVariable int id) {
		//Es un Optional<T>
		Optional<BookRating> u = ratingDAO.findById(id);
		//Si está presente lo devolvemos
		if(u.isPresent()){
		    return ResponseEntity.ok(u.get());
		}
		//Si no, return null
		else{
		    return null;
		}
	}
}
