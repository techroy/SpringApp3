package com.ioc.beans;

public class MessageDisplay {
	
	Message message;

	public void setMessage(Message message) {
		this.message = message;
	}
	
	public void display(String msg){
		
		
		message.displayMessage(msg);
		
	}

}
