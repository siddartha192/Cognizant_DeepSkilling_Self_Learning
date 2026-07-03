package com.cognizant.spring_learn_rest.container;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloContainer.class);
    @GetMapping("/hello")
    public String sayHello(){
        LOGGER.info("Start");
        String message = "Hello World!";
        LOGGER.info("END");
        return message;
    }
}
