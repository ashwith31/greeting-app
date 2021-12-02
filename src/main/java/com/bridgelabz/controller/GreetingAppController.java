package com.bridgelabz.controller;

import com.bridgelabz.Dto.GreetingDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class GreetingAppController {

    @GetMapping("")
    public GreetingDto sayHello(@RequestBody GreetingDto greetingDto){
        return greetingDto;
    }
}
