package io.github.pedron98.controller;

import io.github.pedron98.model.Greeting;
import io.github.pedron98.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public Greeting helloWorld(){
        return service.readMessage();
    }
}
