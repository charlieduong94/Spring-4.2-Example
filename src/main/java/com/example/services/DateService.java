package com.example.services;

import com.example.models.Date;

/**
 * This is the interface for a simple Date service
 *
 * It is generally a good practice to abstract services so that they can be easily swapped
 * later on.
 * @author charlie
 */
public interface DateService {
	/**
	 * Retrieves the current time in milliseconds
	 *
	 * @return Date object containing the current date in milliseconds
	 */
	public Date getDate();
}
