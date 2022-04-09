package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<String> userNotFoundExceptionHandler(UserNotFoundException ex){
		
		return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=MovieNotFoundException.class)
	public ResponseEntity<String> movieNotFoundExceptionHandler(MovieNotFoundException ex){
		
		return new ResponseEntity<String>("Movie Not Found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=ShowNotFoundException.class)
	public ResponseEntity<String> showNotFoundExceptionHandler(ShowNotFoundException ex){
		
		return new ResponseEntity<>("Show Not Found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=BookingNotFoundException.class)
	public ResponseEntity<String> bookingNotFoundExceptionHandler(BookingNotFoundException ex){
		
		return new ResponseEntity<>("Please enter a Valid Booking Id",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=UserExistsException.class)
	public ResponseEntity<String> userExistsExceptionHandler(UserExistsException ex){
		
		return new ResponseEntity<>("User Already Exists",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=EmailIdExistsException.class)
	public ResponseEntity<String> emailExistsExceptionHandler(EmailIdExistsException ex){
		
		return new ResponseEntity<>("EmailId Already Exists",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=PaswordNotSameException.class)
	public ResponseEntity<String> passwordNotSameExceptionHandler(PaswordNotSameException ex){
		
		return new ResponseEntity<>("Password and Confirm Password should be same",HttpStatus.NOT_FOUND);
	}

}
