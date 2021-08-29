package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> mQ = new LinkedList<Message>();
		
		// ³Ö±â 
		mQ.offer(new Message("sendMail", "È«±æµ¿"));
		mQ.offer(new Message("sendSMS", "½Å¿ë±Ç"));
		mQ.offer(new Message("sendKakaotalk", "È«¾îÂ¼±¸"));
		
		while(!mQ.isEmpty()) {
			Message message = mQ.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "´ÔÀÌ°Ô SMS¸¦ º¸³À´Ï´Ù.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.");
				break;
			}
		}
		System.out.println(mQ.size() + "°³");
	}
}
