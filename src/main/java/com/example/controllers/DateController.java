package com.example.controllers;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Date;
import com.example.services.DateService;
import com.example.services.DateServiceImpl;
/**
 * A simple controller for that handles requests to the "/date" path
 *
 * @author charlie
 */
@RestController
public class DateController{
	/**
	 * Using the @Autowired annotation is the preferred method of instantiating a service for use.
	 * As long as there is only one class implementing the DateService interface using the @Service
	 * annotation (see the DateServiceImpl class), Spring will automatically select that class for use.
	 *
	 * If there were multiple implementations of a DateService, the @Qualifier annotation would be added
	 * to specify which implementation to use.
	 *
	 * Ex.
	 *	@Autowired
	 *	@Qualifier("currentMillisDateService")
	 */
	@Autowired
	private DateService dateService;

	/**
	 * The @PostConstruct annotation specifies that right after the creation of the DateController,
	 * run this method (name of method does not matter).
	 *
	 * All Autowired services are available for use in this method if needed
	 */
	@PostConstruct
	public void afterConstruction(){
		// insert whatever you need here
	}

	/**
	 * A simple callback for a GET request to the path "/date"
	 *
	 * All this function does is return the current time in milliseconds
	 *
	 * @return JSON containing the current millis
	 */
	@RequestMapping(
			value="/date", // this is the path that callback is mapped to
			method = RequestMethod.GET, // this specifies that this requires a GET to activated
			produces="application/json") // this specifies the request will produce JSON
	public @ResponseBody Date getMillis(){ // response body is set to the Date Object
		return dateService.getDate();
	}
}
