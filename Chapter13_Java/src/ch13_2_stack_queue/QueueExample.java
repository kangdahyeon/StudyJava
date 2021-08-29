package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> mQ = new LinkedList<Message>();
		
		// �ֱ� 
		mQ.offer(new Message("sendMail", "ȫ�浿"));
		mQ.offer(new Message("sendSMS", "�ſ��"));
		mQ.offer(new Message("sendKakaotalk", "ȫ��¼��"));
		
		while(!mQ.isEmpty()) {
			Message message = mQ.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "���̰� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
		System.out.println(mQ.size() + "��");
	}
}
