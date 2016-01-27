package com.example.models;

/**
 * This is POJO (Plain Old Java Object) that acts as a simple container for data.
 *
 * The data contained in this object will converted into JSON (JavaScript Object Notation)
 * when sent back from the server.
 * @author charlie
 */
public class Response {
	private long code;
  private Object body;

  public long getCode(){
    return code;
  }
  public void setCode(long code){
    this.code = code;
  }
  public Object getBody(){
    return body;
  }
  public void setBody(Object body){
    this.body = body;
  }
}
