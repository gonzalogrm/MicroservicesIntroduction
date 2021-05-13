package com.zalost.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zalost.model.UserCollection;

@Repository
public interface UserCollectionRepository extends JpaRepository<UserCollection, Integer>{

}
