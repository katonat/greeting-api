package io.github.pedron98;

import io.github.pedron98.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    @Bean
    public CommandLineRunner init(@Autowired GreetingService service){
        return args -> {
            service.createMessage("Hello World!");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
