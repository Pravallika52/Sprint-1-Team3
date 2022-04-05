package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesDAO extends CrudRepository<Movies, Integer> {

}
