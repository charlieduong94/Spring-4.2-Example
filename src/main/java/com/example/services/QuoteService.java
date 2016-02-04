package com.example.services;

import com.example.models.Quote;

/**
 * This is the interface for a retrieving a quote
 *
 * It is generally a good practice to abstract services so that they can be easily swapped
 * later on. 
 * @author charlie
 */
public interface QuoteService {
	/**
	 * Retrieves a random quote
	 *
	 * @return Date object containing the current date in milliseconds
	 */
	public Quote getQuote();
}
