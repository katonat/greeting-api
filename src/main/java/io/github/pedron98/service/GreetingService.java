package io.github.pedron98.service;

import io.github.pedron98.model.Greeting;
import io.github.pedron98.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private GreetingRepository repository;

    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public Greeting createMessage(String message){
        Greeting greeting = new Greeting(message);
        return repository.save(greeting);
    }

    public Greeting readMessage(){
        return repository.findOneByMessage("Hello World!");
    }

}
