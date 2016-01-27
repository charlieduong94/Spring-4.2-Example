package com.example.controllers;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.example.models.User;
import com.example.models.Response;
import com.example.services.UserService;

import org.springframework.web.bind.annotation.RequestBody;
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
	public String createUser(@RequestBody User user){
		// retrieve a quote
		return userService.createUser(user.getName(), user.getAge());
	}
	@RequestMapping(
			value="/users/count",
			method = RequestMethod.GET)
	public String getCount(){
		// retrieve a quote
		return userService.getUserCount();
	}
	@RequestMapping(
			value="/users/all",
			method = RequestMethod.GET)
	public Response getAllUsers(){
		// retrieve a quote
		return userService.getAllUsers();
	}
}
