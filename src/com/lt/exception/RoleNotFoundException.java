package com.lt.exception;

public class RoleNotFoundException extends Exception {
    public String getMessage(){
        return  "Role Not Found";
    }

}
