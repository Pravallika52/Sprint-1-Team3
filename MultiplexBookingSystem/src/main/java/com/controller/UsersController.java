package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.BookingNotFoundException;
import com.exception.EmailIdExistsException;
import com.exception.PaswordNotSameException;
import com.exception.UserExistsException;
import com.exception.UserNotFoundException;
import com.model.Movies;
import com.model.Shows;
import com.model.ShowsDAO;
import com.model.Users;
import com.model.UsersDAO;
import com.model.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	UsersDAO usersDAO;
	@Autowired
	UsersService service;
	@Autowired
	ShowsDAO showsDAO;
	
	@GetMapping("/getallusers")
	public Iterable<Users> getAllUsers(){
	return usersDAO.findAll();
	}
	
	@PostMapping("/registeruser")
	public String registerUser(@RequestBody Users users) throws EmailIdExistsException, PaswordNotSameException {
		Optional<Users> opt=usersDAO.findByUserName(users.getUserName());
		Optional<Users> opt2=usersDAO.findByemailId(users.getEmailId());
		if(opt.isPresent()) {
			throw new UserExistsException();
		}
		if(opt2.isPresent()) {
			throw new EmailIdExistsException();
		}
		String p=users.getUserPassword();
		String p2=users.getUserConfirmPassword();
		if(!p.equals(p2)) {
			throw new PaswordNotSameException();
		}
		usersDAO.save(users);
		return "User Successfully Registered";
	}
	
	@PatchMapping("/updateuser")
	public String updateUser(@RequestBody Users users) {
		usersDAO.save(users);
		return "User Details Updated";
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable("id") int userid) {
		Optional<Users> opt=usersDAO.findById(userid);
		if(!opt.isPresent()) {
			throw new UserNotFoundException();
		}
		usersDAO.deleteById(userid);
		return "User Deleted";
	}
	
	@GetMapping("/user/findmovie/{id}")
	public Movies findMovie(@PathVariable("id") int movieid) {
		return service.findMovieById(movieid);
	}
	
	@GetMapping("/user/finduser/{id}")
	public Users findUser(@PathVariable("id") int userid) {
		return service.findUserbyId(userid);
	}
	
	@GetMapping("/user/findshow/{id}")
	public Shows findShow(@PathVariable("id") int showid) {
		return service.findShowbyId(showid);
	}
	
	@DeleteMapping("/user/cancelbooking/{id}")
	public String cancelBooking(@PathVariable("id") int bookingid) throws BookingNotFoundException {
		return service.cancelBooking(bookingid);
	}
	
	@GetMapping("/user/finduserbyname/{userName}")
	public Optional<Users> getUserByName(@PathVariable String userName) {
		Optional<Users> opt=usersDAO.findByUserName(userName);
		if(!opt.isPresent()) {
			throw new UserNotFoundException();
		}
		return usersDAO.findByUserName(userName);
	}
	

}
