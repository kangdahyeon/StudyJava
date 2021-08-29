package ch09_2_anonymous;

class Animal {
	void sound() {System.out.println("8ㅅ8");}
}
class Dog extends Animal {
	@Override
	void sound() {System.out.println("멍멍");}
	
	void run() {System.out.println("산책");}
}
class Cat extends Animal {
	@Override
	void sound() { System.out.println("애옹");}
	void jump() {System.out.println("식탁위에 올라간다");}
}

class Fish extends Animal {
	@Override
	void sound() { System.out.println("소리있냐고..");}
	void swim() {System.out.println("어떻게 살아가는중");}
}

public class Example {
	public static void main(String[] args) {
		Animal ani = new Animal() { 	// ani 안에 {}; 중괄호 내부의 것들이 모두 들어간것.
			void run() {System.out.println("산책");}
			@Override
			void sound() {System.out.println("멍멍"); run();}
		};
		ani.sound();
		
		ani = new Animal() {
			void swim () { System.out.println("뛰어오르기");}
			@Override
			void sound() { System.out.println("OooOooo"); swim();}
		};
		ani.sound();
	}
}	
