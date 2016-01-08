package com.example.services;

import com.example.models.Date;

/**
 * This is a simple service that returns the (system's) current time in millis.
 * @author charlie
 */
public class DateService {
	public Date getCurrentMillis(){
		Date date = new Date();
		date.setCurrentMillis(System.currentTimeMillis());
		return date;
	}
}
