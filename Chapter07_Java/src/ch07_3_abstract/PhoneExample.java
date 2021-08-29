package ch07_3_abstract;

abstract class Phone {
	//�ʵ�
	public String owner;
	
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 
		//-> ���� Ŭ������ �ٷ� �ҷ��ͼ� ������� ����, ��ӹ��� Ŭ������ �ҷ��ͼ� ����ؾ��Ѵ�.
	
		SmartPhone smartPhone = new SmartPhone("ȫ�浿???");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
