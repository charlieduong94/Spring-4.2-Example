package com.example.models;

/**
 * This is POJO (Plain Old Java Object) that acts as the value for the "value" key JSON we requested.
 */
public class Value {
  /**
   *  The id needs to be a long, not an integer.
   */
	private long id;
  private String quote;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

  public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
