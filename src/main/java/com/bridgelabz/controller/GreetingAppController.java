package com.bridgelabz.controller;

import com.bridgelabz.Dto.GreetingDto;
import com.bridgelabz.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class GreetingAppController {
    @Autowired
    GreetingAppService greetingAppService;

    /**
     *
     * @param greetingDto
     * @return
     */
    @GetMapping("")
    public GreetingDto sayHello(@RequestBody GreetingDto greetingDto){
        return greetingDto;
    }

    //http://localhost:8080/message
    @GetMapping("/message")
    public String getGreeting(){
        return greetingAppService.greet();
    }

    @GetMapping(value = {"/greetmessage"})
    public String helloMessage(@RequestParam(value ="firstName", defaultValue ="") String firstName, @RequestParam (value ="lastName", defaultValue ="") String lastName) {
        return greetingAppService.getGreeting(firstName,lastName);
    }
}
