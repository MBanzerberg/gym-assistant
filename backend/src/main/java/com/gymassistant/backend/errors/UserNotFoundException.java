package com.gymassistant.backend.errors;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(int id) {
        super("Could not find User " + id);
    }
}
