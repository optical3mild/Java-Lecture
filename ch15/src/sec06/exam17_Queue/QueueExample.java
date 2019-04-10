package sec06.exam17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> msgQueue = new LinkedList<Message>();
		
		msgQueue.offer(new Message("sendMail","홍"));
		msgQueue.offer(new Message("sendSMS","신"));
		msgQueue.offer(new Message("sendTalk","김"));

		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to+"님에게 SMS를 보냅니다.");
				break;
			case "sendTalk":
				System.out.println(message.to+"님에게 Talk를 보냅니다.");
				break;
			}
		}
	}

}
