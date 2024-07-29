package com.example.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/logapi")
    public String hello() {
        logger.info("Hello there");
        logger.warn("This is sample warn message");
        logger.error("This is sample error message");
        logger.debug("This is sample debug message");

        return "Hello let's football";
    }
}