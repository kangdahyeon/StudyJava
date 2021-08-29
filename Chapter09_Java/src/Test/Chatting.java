package Test;

public class Chatting {
	void startChat(String chatId) {
//		String nickName = null;
//		nickName = chatId;  -> nickName은 final 변수여서 재 할당이 불가능함.
		String nickName = chatId; // -> 이렇게 설정하면 됌.
	
	class Chat {
		public void start() {
			while(true) {
				String inputData = "안녕하세요.";
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
