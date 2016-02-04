package com.example.services;

import org.springframework.stereotype.Service;
import com.example.models.Date;
/**
 * This is a simple service that returns the (system's) current time in millis.
 *
 * The @Service annotation specifies that the class is a Service. A service can be
 * given a name if needed as shown below.
 *
 * @author charlie
 */
@Service("currentMillisDateService")
public class DateServiceImpl implements DateService {
	public Date getDate(){
		// instantiate Date object
		Date date = new Date();
		date.setCurrentMillis(System.currentTimeMillis());
		return date;
	}
}
