package com.example.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.models.User;
import com.example.models.Response;
import com.example.models.daos.UserDao;
import com.example.models.daos.UserDaoImpl;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * This the implementation of a service that interacts with the User table in our DB.
 *
 * The @Service annotation specifies that the class is a Service. A service can be
 * given a name if needed as shown below.
 *
 * @author charlie
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	/**
	 *	Method for creating a users. The service calls the DAO (Data Access Object) and tells it to
	 *	This would be where you handle validation.
	 **/
	public Response createUser(String name, long age){
		int code = 10;
		String message = "User already exists";
		if(name == null || age == 0){
			code = 11;
			message = "name or age is not valid";
		}
		else if(dao.createUser(name.trim(), age) != -1){
			code = 0;
			message = "User created";
		}
		Response res = new Response();
		res.setCode(code);
		res.setRes(message);
		return res;
	}
  public Response getUserCount(){
	  	int code = 20;
		String message = "Could not get user count";
		long userCount = dao.getUserCount();
		if(userCount != -1){
			code = 0;
			message = "There are " + userCount + " users in the database.";
		}
	    Response res = new Response();
	    res.setCode(code);
	    res.setRes(message);
      	return res;
  }

	public Response getAllUsers(){
		Response res = new Response();
		List<User> users = dao.getAllUsers();
		res.setCode(0);
		res.setRes(users);
		return res;
	}
}
