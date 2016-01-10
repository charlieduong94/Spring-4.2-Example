package com.example.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Here is an example showing how to make serve your own custom error page,
 * instead of Spring's WhiteLabel error page.
 * 
 * You need to implement Spring's Error controller 
 * @author charlie
 */
@RestController
public class CustomErrorController implements ErrorController{
	
	// the error path needs to be "/error"
	private static final String ERROR_PATH = "/error";
	/**
	 * This method must be implemented and return the error path
	 */
	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
	/**
	 * Retrieves the error page
	 * 
	 * @return the error page
	 */
	@RequestMapping(value=ERROR_PATH)
	public FileSystemResource errorHandler(){
		/**
		 * The relative path used is your project's root directory.
		 * So you can put in the path to your errorPage
		 */
		return new FileSystemResource("src/main/webapp/html/errorPage.html");
	}
}
