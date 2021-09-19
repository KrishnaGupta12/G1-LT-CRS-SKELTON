package com.lt.exception;

public class UserNotFoundException extends Exception{

    private String username;
    private String password;

    public UserNotFoundException(String username, String password)
    {
        this.username=username;
        this.password=password;
    }

    public String getMessage(String username,String password){
        return "Username and password is Invalid   : "+username+password;
    }

}
