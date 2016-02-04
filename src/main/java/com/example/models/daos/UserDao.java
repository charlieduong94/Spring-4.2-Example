package com.example.models.daos;

import java.util.List;
import com.example.models.User;
/**
 * This is the interface for our data access object.
 * @author charlie
 */
public interface UserDao {
	public int createUser(String name, long age);
	public long getUserCount();
	public List<User> getAllUsers();
}
