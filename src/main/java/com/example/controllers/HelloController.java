package com.example.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * A simple controller for that handles requests to the "/hello" path.
 *
 * @author charlie
 */
@RestController
public class HelloController{
	/**
	 * A simple callback for a GET request to the path "/hello/{name}"
	 *
	 * Ex. "/hello/world" will return "Hello world!"
	 *
	 * The path variable is required, so "/hello" will just return a 404
	 *
	 * The function is able to take a path parameter and use it to send back a small message
	 * @param name
	 * @return Plain text saying "Hello {name}"
	 */
	@RequestMapping(
			value="/hello/{name}", // this is the path that callback is mapped to
			method = RequestMethod.GET, // this specifies that this requires a GET to activated
			produces="text/plain") // this specifies the type of data the request will produce
	public String hello(@PathVariable String name){
		// @PathVariable above specifies that the variable is supplied from the path in the url
		return "Hello " + name + "!\nTry replacing " + name +" in the URL with another word";
	}
}
