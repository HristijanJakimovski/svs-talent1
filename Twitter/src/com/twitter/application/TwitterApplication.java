package com.twitter.application;

import java.util.ArrayList;

import com.twitter.message.TwitterMessage;
import com.twitter.message.UserMessages;

public class TwitterApplication {
	
	UserMessages messages=new UserMessages();
	public void tweetMessage(String message) {
		TwitterMessage twitterMessage= new TwitterMessage();
		twitterMessage.setMessage(message);
		messages.addMessage(twitterMessage);
	}
	public void listMessages() {
		ArrayList<TwitterMessage> listMessages=messages.getMessages();
		for(int i=listMessages.size()-1;i>=0;i--) {
			TwitterMessage twittermessage= listMessages.get(i);
			String mesage = twittermessage.getMessage();
			System.out.println(mesage);
		}
	}
	
	

}
