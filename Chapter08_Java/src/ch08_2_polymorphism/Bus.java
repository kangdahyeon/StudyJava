package ch08_2_polymorphism;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("Bus�� �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}

}