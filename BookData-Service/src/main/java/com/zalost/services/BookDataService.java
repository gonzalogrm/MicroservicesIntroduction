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

import com.zalost.model.BookData;
import com.zalost.persistence.BookDataRepository;

@RestController 
@RequestMapping("/bookdata")
public class BookDataService {
	@Autowired
	private BookDataRepository bookdataDAO;
	
	//REST: get all (GET)
	@GetMapping("/data")
	public List<BookData> findAll(){
		return bookdataDAO.findAll();
	}		
	
	//REST: get user by ID (GET)
	//@PathVariable: Annotation which indicates that a method parameter 
	//should be bound to a URI template variable.
	@GetMapping("/data/{id}")
	public ResponseEntity<BookData> getByID(@PathVariable int id) {
		//Es un Optional<T>
		Optional<BookData> u = bookdataDAO.findById(id);
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