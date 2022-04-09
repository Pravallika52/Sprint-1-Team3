package com.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.BookingNotFoundException;
import com.exception.MovieNotFoundException;
import com.exception.ShowNotFoundException;
import com.exception.UserNotFoundException;


@Service
public class UsersService{
	
	@Autowired
	UsersDAO usersDAO;
	@Autowired
	MoviesDAO moviesDAO;
	@Autowired
	ShowsDAO showsDAO;
	@Autowired
	BookingDAO bookingDAO;
	@Autowired
	BookingDetailsDAO bookingDetailsDAO;
	
	public Users findUserbyId(int id) throws UserNotFoundException{
		Optional<Users> opt=usersDAO.findById(id);
		if(!opt.isPresent()) {
			throw new UserNotFoundException();
		}
		return opt.get();
	}
	
	public Movies findMovieById(int id) throws MovieNotFoundException{
		Optional<Movies> opt=moviesDAO.findById(id);
		if(!opt.isPresent()) {
			throw new MovieNotFoundException();
		}
		return opt.get();
	}
	
	public Shows findShowbyId(int id) throws ShowNotFoundException{
		Optional<Shows> opt=showsDAO.findById(id);
		if(!opt.isPresent()) {
			throw new ShowNotFoundException();
		}
		return opt.get();
	}
	
	public String cancelBooking(int bookingid) throws BookingNotFoundException {
		Optional<Booking> opt=bookingDAO.findById(bookingid);
		if(!opt.isPresent()) {
			throw new BookingNotFoundException();
		}
		bookingDAO.deleteById(bookingid);
		return "Booking Canceled";
	}
	
/*	public Optional<Users> findUserByName(String userName) {
		Optional<Users> opt=usersDAO.findByUserName(userName);
		if(!opt.isPresent()) {
			throw new UserNotFoundException();
		}
		return usersDAO.findByUserName(userName);
	}
	*/
	
	
}
