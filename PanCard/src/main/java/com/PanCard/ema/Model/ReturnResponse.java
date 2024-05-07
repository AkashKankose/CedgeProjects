package com.PanCard.ema.Model;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ReturnResponse implements Response{

	private Object obj;
	private HttpStatus httpstatus;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}
	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}
	@Override
	public String toString() {
		return "ReturnResponse [obj=" + obj + ", httpstatus=" + httpstatus + "]";
	}
	public ReturnResponse(Object obj, HttpStatus httpstatus) {
		super();
		this.obj = obj;
		this.httpstatus = httpstatus;
	}
	public ReturnResponse() {
		super();
	}
	
}
