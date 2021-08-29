package ch09_2_anonymous;

class Button {
	//중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
	//인터페이스 타입 필드 
	OnClickListener listener;
	
	//매개변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	//인터페이스 구현 객체의 onClick()메소드 호출
	void touch() {
		listener.onClick();
	}
	

}

class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
public class Main {
	public static void main(String[] args) {
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();
	}
}
