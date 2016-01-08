package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
/**
 * This is the entry point of the application.
 *  
 * The @SpringBootApplication annotation is required to mark this class as
 * the entry point point.
 * 
 * The @EnableAutoConfiguration annotation tells application to look for beans on its own.
 * 
 * @author charlie
 */
@EnableAutoConfiguration
@SpringBootApplication
public class SpringTestApplication {
    public static void main(String[] args) throws Exception {
    	SpringApplication.run(SpringTestApplication.class, args);
    }
}