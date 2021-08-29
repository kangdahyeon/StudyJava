package ch09_2_anonymous;

class Animal {
	void sound() {System.out.println("8��8");}
}
class Dog extends Animal {
	@Override
	void sound() {System.out.println("�۸�");}
	
	void run() {System.out.println("��å");}
}
class Cat extends Animal {
	@Override
	void sound() { System.out.println("�ֿ�");}
	void jump() {System.out.println("��Ź���� �ö󰣴�");}
}

class Fish extends Animal {
	@Override
	void sound() { System.out.println("�Ҹ��ֳİ�..");}
	void swim() {System.out.println("��� ��ư�����");}
}

public class Example {
	public static void main(String[] args) {
		Animal ani = new Animal() { 	// ani �ȿ� {}; �߰�ȣ ������ �͵��� ��� ����.
			void run() {System.out.println("��å");}
			@Override
			void sound() {System.out.println("�۸�"); run();}
		};
		ani.sound();
		
		ani = new Animal() {
			void swim () { System.out.println("�پ������");}
			@Override
			void sound() { System.out.println("OooOooo"); swim();}
		};
		ani.sound();
	}
}	
