package com.example.models;

/**
 * This is POJO (Plain Old Java Object) that acts as a simple container for data.
 * 
 * The data contained in this object will converted into JSON (JavaScript Object Notation)
 * when sent back from the server.
 * @author charlie
 */
public class Date {
	private long currentMillis;

	public long getCurrentMillis() {
		return currentMillis;
	}

	public void setCurrentMillis(long currentMillis) {
		this.currentMillis = currentMillis;
	}
	
}
