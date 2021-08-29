package ch10_1_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	//						Animal animal = dog -> Animal�� �ڵ� ����ȯ 
	//									  = cat -> 
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		//          = (Dog) cat �ΰ��̳� ���������� �ȵ�.
		} else {
			System.out.println("DogŸ���� �ƴմϴ�.");			
		}
	}
}
class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}
