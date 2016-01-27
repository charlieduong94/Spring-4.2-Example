package com.example.services;

import com.example.models.User;
import java.util.List;
import com.example.models.Response;
/**
 * This is the interface for a retrieving a quote
 *
 * It is generally a good practice to abstract services so that they can be easily swapped
 * later on.
 * @author charlie
 */
public interface UserService {
	/**
	 * Retrieves a random quote
	 *
	 * @return Date object containing the current date in milliseconds
	 */
	public String createUser(String name, long age);
  public String getUserCount();
	public Response getAllUsers();
}
