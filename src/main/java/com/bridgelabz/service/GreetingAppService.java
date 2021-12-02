package com.bridgelabz.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {

    public String greet() {
        return "Hello World";
    }

    public String getGreeting(String firstName, String lastName) {
        if (firstName.length() > 0 || lastName.length() > 0)
            return "Hello " + firstName + " " + lastName;
        else
            return "Hello World";
    }
}
