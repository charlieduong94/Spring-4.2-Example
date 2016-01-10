package com.example.controllers;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.models.Quote;
import com.example.services.QuoteService;

/**
 * A simple controller for that serves the default page
 *
 * @author charlie
 */
@RestController
public class IndexController{
	@Autowired
	QuoteService quoteService;
	/**
	 * A simple callback for a GET request to '/' that returns rendered HTML

	 * @return A webpage generated using JSP
	 */
	@RequestMapping(
			value="/",
			method = RequestMethod.GET)
	public ModelAndView getWelcomePage(){
		Quote quote = quoteService.getQuote();
		System.out.println(quote.getValue().getQuote());
    // Create a ModelAndView object using the welcomePage from "/src/main/webapp/WEB-INF/templates/welcomePage.jsp"
    // Spring is able to find this because of the properties set in the "application.properties" file
    ModelAndView model = new ModelAndView("welcomePage");
    // add an object with the name message that will be rendered on the view
    model.addObject("quoteType", quote.getType());
		model.addObject("quoteID", quote.getValue().getId());
		model.addObject("quote", quote.getValue().getQuote());
    // return the page
		return model;
	}
}
