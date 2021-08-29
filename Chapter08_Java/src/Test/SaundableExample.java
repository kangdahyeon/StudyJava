package Test;

interface Soundable {
	String sound();
}
class Dog implements Soundable {
	@Override
	public String sound() {
		return "�۸�";
	}
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "�߿�";
	}
}

public class SaundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());	
	}
}
