package com.example.models.daos;

import java.util.List;
import com.example.models.User;
/**
 * This is POJO (Plain Old Java Object) that acts as a simple container for data.
 *
 * The data contained in this object will converted into JSON (JavaScript Object Notation)
 * when sent back from the server.
 * @author charlie
 */
public interface UserDao {
	public int createUser(String name, long age);
	public long getUserCount();
	public List<User> getAllUsers();
}
