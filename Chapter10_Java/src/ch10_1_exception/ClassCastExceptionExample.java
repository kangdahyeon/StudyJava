package ch10_1_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	//						Animal animal = dog -> Animal로 자동 형변환 
	//									  = cat -> 
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		//          = (Dog) cat 인것이나 마찬가지라 안들어감.
		} else {
			System.out.println("Dog타입이 아닙니다.");			
		}
	}
}
class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}
