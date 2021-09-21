package com.lt.exception;

public class UserNotFoundException extends Exception{
	
public String username;
public String password;
	
public UserNotFoundException(String username, String password) {
	
	this.username = username;
	this.password = password;
}
	
	public String getMessage(String username, String password){
		return "Professor With Id "+username+password+"Not Found!!!";
	}

	

}