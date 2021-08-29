package ch07_3_abstract;

abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
	// 추상메소드(상속받는 자식 클래스에서의 오버라이딩을 강제화)
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("애옹");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	//자동 타입 변환되어 (Animal animal)에 재정의 
	public static void animalSound(Animal animal) {
		animal.sound();	//재정의된 메소드 호출
	}
}
