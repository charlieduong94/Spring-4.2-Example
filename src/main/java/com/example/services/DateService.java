package com.example.services;

import com.example.models.Date;

/**
 * This is the interface for a simple Date service
 *
 * It is generally a good practice to abstract services so that they can be easily swapped
 * later on. For this situation, it's pretty much over kill.
 * @author charlie
 */
public interface DateService {
	public Date getCurrentMillis();
}
