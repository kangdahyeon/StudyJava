package Test;

public class Chatting {
	void startChat(String chatId) {
//		String nickName = null;
//		nickName = chatId;  -> nickName�� final �������� �� �Ҵ��� �Ұ�����.
		String nickName = chatId; // -> �̷��� �����ϸ� ��.
	
	class Chat {
		public void start() {
			while(true) {
				String inputData = "�ȳ��ϼ���.";
				String message = "[" + nickName + "]" + inputData;
				sendMessage(message);
			}
		}
		void sendMessage(String message) {
		}
	}
	Chat chat = new Chat();
	chat.start();
	}
}
