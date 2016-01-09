package com.example.controllers;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.models.Date;
import com.example.services.DateService;

/**
 * A simple controller for that serves the default page
 *
 * @author charlie
 */
@RestController
public class IndexController{
	/**
	 * A simple callback for a GET request to '/'.

	 * @return A webpage generated using JSP
	 */
	@RequestMapping(
			value="/",
			method = RequestMethod.GET)
	public ModelAndView getWelcomePage(){
    // Create a ModelAndView object using the welcomePage from "/src/main/webapp/WEB-INF/templates/welcomePage.jsp"
    // Spring is able to find this because of the properties set in the "application.properties" file
    ModelAndView model = new ModelAndView("welcomePage");
    // add an object that will be available to the page
    model.addObject("message", "Welcome to Spring!");
    // return the page
		return model;
	}
}
