package com.unique.Webgoat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebgoatApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebgoatApplication.class, args);
    }
    
    @RestController
    class WelcomeController { 
        @GetMapping("/") 
        public String welcome() {  
            return "Welcome to Devsecops course";  
        }
    }
}
