package com.example.controllers;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Date;
import com.example.services.DateService;

/**
 * A simple controller for that handles requests to the "/date" path
 * 
 * @author charlie
 */
@RestController
public class DateController{
	private DateService dateService;
	
	/**
	 * The @PostConstruct annotation specifies that right after the creation of the DateController,
	 * run this init method. All the method does is initialize our dateService object
	 */
	@PostConstruct
	public void init(){
		dateService = new DateService();
	}
	
	/**
	 * A simple callback for a GET request to the path "/date"
	 * 
	 * All this function does is return the current time in milliseconds
	 * 
	 * @param name
	 * @return JSON containing the current millis
	 */
	@RequestMapping(
			value="/date", // this is the path that callback is mapped to
			method = RequestMethod.GET, // this specifies that this requires a GET to activated
			produces="application/json") // this specifies the request will produce JSON
	public @ResponseBody Date getMillis(){ // response body is set to the Date Object
		return dateService.getCurrentMillis();
	}
}