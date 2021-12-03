package com.bridgelabz.service;

import com.bridgelabz.Dto.GreetingDto;
import com.bridgelabz.model.Greetings;
import com.bridgelabz.repository.GreetingsAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingAppService {

    @Autowired
    GreetingsAppRepository greetingsAppRepository;

    public String greet() {
        return "Hello World";
    }

    public String getGreeting(String firstName, String lastName) {
        if (firstName.length() > 0 || lastName.length() > 0)
            return "Hello " + firstName + " " + lastName;
        else
            return "Hello World";
    }

    public String saveGreeting(Greetings message) {
        return greetingsAppRepository.save(message).toString();
    }

    public Greetings getGreetingById(int id) {
        Optional<Greetings> greetById = greetingsAppRepository.findById(id);
        if (greetById.isPresent()) {
            return greetById.get();
        }
        return null;
    }

    public List<Greetings> getall() {
        return greetingsAppRepository.findAll();
    }

    public String editGreeting(Greetings message) {
        return greetingsAppRepository.save(message).toString();
    }
}
