package ch07_3_abstract;

abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	public abstract void sound();
	// �߻�޼ҵ�(��ӹ޴� �ڽ� Ŭ���������� �������̵��� ����ȭ)
}

class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	@Override
	public void sound() {
		System.out.println("�ֿ�");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----");
		
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	//�ڵ� Ÿ�� ��ȯ�Ǿ� (Animal animal)�� ������ 
	public static void animalSound(Animal animal) {
		animal.sound();	//�����ǵ� �޼ҵ� ȣ��
	}
}
