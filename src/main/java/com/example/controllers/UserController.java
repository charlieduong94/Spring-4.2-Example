package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.models.User;
import com.example.models.Response;
import com.example.services.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * A simple controller for that serves the default page
 *
 * @author charlie
 */
@RestController
public class UserController{

	@Autowired
	private UserService userService;
	/**
	 * A simple callback for a GET request to '/' that returns rendered HTML

	 * @return A webpage generated using JSP
	 */
	@RequestMapping(
			value="/users/create",
			method = RequestMethod.POST)
	public ResponseEntity<Response> createUser(@RequestBody User user){
		// retrieve a quote
		Response res = userService.createUser(user.getName(), user.getAge());
		HttpStatus status = HttpStatus.OK;
		if(res.getCode() != 0){
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Response>(res, status);
	}
	@RequestMapping(
			value="/users/count",
			method = RequestMethod.GET)
	public ResponseEntity<Response> getCount(){
		Response res = userService.getUserCount();
		HttpStatus status = HttpStatus.OK;
		if(res.getCode() != 0){
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Response>(res, status);
	}
	@RequestMapping(
			value="/users/all",
			method = RequestMethod.GET)
	public ResponseEntity<Response> getAllUsers(){
		Response res = userService.getAllUsers();
		HttpStatus status = HttpStatus.OK;
		if(res.getCode() != 0){
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Response>(res, status);
	}
	@RequestMapping(
			value="/users",
			method = RequestMethod.GET)
	public ModelAndView getPage(){
		ModelAndView modelAndView = new ModelAndView("usersPage");
		modelAndView.addObject("users", userService.getAllUsers().getRes());
		return modelAndView;
	}
}
