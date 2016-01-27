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
 * This the implementation of a service that generates a random quote.
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
	 *	Method for creating a users. The service delegates all of the work over to the data access object.
	 *	This would be where you handle validation.
	 **/
	public String createUser(String name, long age){
			String message = "Could not create user";
			if(dao.createUser(name, age) != -1){
				message = "User created";
			}
			return message;
	}
  public String getUserCount(){
			String message = "Could not get user count";
			long userCount = dao.getUserCount();
			if(userCount != -1){
				message = "There are " + userCount + " users in the database.";
			}
      return message;
  }

	public Response getAllUsers(){
		List<User> users = dao.getAllUsers();
		// if you need uniform responses, you can do something like this.
		// the response's body takes in any java object, so you can wrap your dao outputs
		// into an object like this.
		Response res = new Response();
		res.setCode(100);
		res.setBody(users);
		return res;
	}
}
