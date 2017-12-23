package com.twitter.message;

import java.util.ArrayList;

public class UserMessages {
	
	public ArrayList<TwitterMessage> messages=new ArrayList<TwitterMessage>();

	public ArrayList<TwitterMessage> getMessages() {
		return messages;
	}


	
	
	public void addMessage(TwitterMessage message) {
		messages.add(message);
	}
	

}
