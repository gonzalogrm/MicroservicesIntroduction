package com.zalost.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zalost.model.BookRating;

@Repository
public interface BookRatingRespository extends JpaRepository<BookRating, Integer>{

}