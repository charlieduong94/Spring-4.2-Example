package com.example.models;

/**
 * This is POJO (Plain Old Java Object) that acts as a simple container for a
 * quote.
 *
 * This is used for mapping the JSON response of a request to a Java Object. If
 * you go to "http://gturnquist-quoters.cfapps.io/api/random", you should be
 * able to the JSON we are trying to model here.
 *
 * Spring's RestTemplate is smart enough to map the values of the request to our
 * class.
 */
public class Quote {

	/**
	 * As you may have noticed, the JSON contains the keys "type" and "value".
	 * Since the "type" is simply a String, we can specify a String field to
	 * hold the value.
	 */
	private String type;
	/**
	 * We can create define another object and map out the value of the "value"
	 * object by creating another class that maps to it's contents.
	 */
	private Value value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

}
