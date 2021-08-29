package ch07_3_abstract;

abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 
		//-> 기준 클래스를 바로 불러와서 사용하지 말고, 상속받은 클래스를 불러와서 사용해야한다.
	
		SmartPhone smartPhone = new SmartPhone("홍길동???");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
