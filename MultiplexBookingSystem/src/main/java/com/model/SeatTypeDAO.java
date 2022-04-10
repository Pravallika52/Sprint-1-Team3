package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatTypeDAO extends CrudRepository<SeatType, Integer> {

}


	