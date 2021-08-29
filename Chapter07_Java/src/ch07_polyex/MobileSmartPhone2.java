package ch07_polyex;

class MobilePhone {
	//필드
	protected String number;
	
	//생성자
	public MobilePhone(String number) {
		this.number = number;	//this 를 붙이지 않아도 가능은 하나,변수이름이 같으면 헷갈리지 않게 this를 써주는것이 좋다.
		
	}
	//메소드
	public void receive() {
		System.out.println("Hi form" + this.number);
	}
}

	class SmartPhone extends MobilePhone {
	//필드
	private String androidVer;
	
	//생성자
	public SmartPhone(String num, String ver) {	// 괄호 안에 상속받은변수, 초기화할 변수 넣어준다.
		super(num);
		androidVer = ver;
	}
	//메소드
	public void send(String number) {
		System.out.println("Hello to" + number);
	}
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		super.receive();
		System.out.println("Smart");
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
public class MobileSmartPhone2 {
	public static void main(String[] args) {
		//스마트폰 객체 생성
		SmartPhone phone1 = new SmartPhone("010-1234-1234", "Android7.0");
		
		MobilePhone phone2 = new SmartPhone("010-0000-1234", "Android7.0");
		//부모 클래스의 참조변수(phone2)는 자식 클래스(SmartPhone)의 인스턴스를 참조할수있다.
		//MobilePhone형 참조변수는 SmartPhone의 인스턴스를 참조 가능.(위랑 같은말)
		//이렇게 형변환을 하면 phone2에서는 MobilePhone의 메소드만 사용가능하다.
		SmartPhone phone3 =(SmartPhone) new MobilePhone("1234");
		//자식클래스에 부모클래스의 인스턴스를 참조하려고 하면, 강제로 형변환하지 않으면 오류가 난다.
		

		//전화걸기
		phone1.send("010-5678-5678");
		
		//전화받기
		phone1.receive();
		phone2.receive();
		//앱을 선택하여 실행하기
		phone1.playApp();
	}
}

