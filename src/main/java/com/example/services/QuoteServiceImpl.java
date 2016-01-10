package com.example.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.models.Quote;

/**
 * This the implementation of a service that generates a random quote.
 *
 * The @Service annotation specifies that the class is a Service. A service can be
 * given a name if needed as shown below.
 *
 * @author charlie
 */
@Service("randomSpringBootQuoteService")
public class QuoteServiceImpl implements QuoteService {
  /**
	 * Retrieves a random quote about Spring Boot from http://gturnquist-quoters.cfapps.io/api/random
	 *
	 * @return Date object containing the current date in milliseconds
	 */
	public Quote getQuote(){
    // create a RestTemplate, which is used to make HTTP requests from our server.
    RestTemplate template = new RestTemplate();
    // give the template the url to make the request to and the class to map the results to.
    // the getForObject returns the data type that it is supplied
    Quote quote = template.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    return quote;
	}
}
