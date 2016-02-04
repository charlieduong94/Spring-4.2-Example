package com.example.models;

/**
 * This is POJO (Plain Old Java Object) that acts as a simple container for data.
 *
 * The data contained in this object will converted into JSON (JavaScript Object Notation)
 * when sent back from the server.
 * @author charlie
 */
public class User {
	private long id;
	private long age;
  private String name;

	public long getId(){
		return id;
	}

  public String getName() {
		return name;
	}

	public long getAge() {
		return age;
	}

	public void setId(long id){
		this.id = id;
	}

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(long age) {
    this.age = age;
  }
}
