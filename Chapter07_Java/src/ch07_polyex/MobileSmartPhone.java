//package ch07_polyex;
//
//class MobilePhone {
//	//필드
//	protected String number;
//	
//	//생성자
//	public MobilePhone(String number) {
//		this.number = number;	//this 를 붙이지 않아도 가능은 하나,변수이름이 같으면 헷갈리지 않게 this를 써주는것이 좋다.
//		
//	}
//	//메소드
//	public void receive() {
//		System.out.println("Hi form" + this.number);
//	}
//}
//
//public class SmartPhone extends MobilePhone {
//	//필드
//	private String androidVer;
//	
//	//생성자
//	public SmartPhone(String num, String ver) {	// 괄호 안에 상속받은변수, 초기화할 변수 넣어준다.
//		super(num);
//		androidVer = ver;
//	}
//	//메소드
//	public void send(String number) {
//		System.out.println("Hello to" + number);
//	}
//	@Override
//	public void receive() {
//		// TODO Auto-generated method stub
//		super.receive();
//		System.out.println("Smart");
//	}
//	public void playApp() {
//		System.out.println("App is running in " + androidVer);
//	}
//}
//public class MobileSmartPhone {
//	public static void main(String[] args) {
//		//스마트폰 객체 생성
//		SmartPhone phone = new SmartPhone("010-1234-1234", "Android7.0");
//		
//		//전화걸기
//		phone.send("010-5678-5678");
//		
//		//전화받기
//		phone.receive();
//		//앱을 선택하여 실행하기
//		phone.playApp();
//	}
//}
//
