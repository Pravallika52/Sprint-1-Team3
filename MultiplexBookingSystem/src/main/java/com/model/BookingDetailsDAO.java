package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailsDAO extends CrudRepository<BookingDetails, Integer> {

}
