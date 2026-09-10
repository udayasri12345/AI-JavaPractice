package com.over.quest2;

public class MessengerMain {
	public static void main(String[] args) {
		Messenger messenger=new Messenger();
		messenger.sendMail("sending message");
		messenger.sendMail("Udaya","sending message");
		messenger.sendMail("Dinesh","sending message","Subject job");
	}
}
