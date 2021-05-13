package com.zalost.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zalost.model.BookData;

@Repository
public interface BookDataRepository extends JpaRepository<BookData, Integer>{

}