package ch07_2_polymorphism;

class Parent {
	//필드
	String p_str = "Parent String";
	
	//생성자
	//메소드
	void print() {
		System.out.println(p_str);
	}
}

class Child extends Parent {
	//필드
	String S_str = "Child String";
	//생성자
	//메소드
	
	@Override
	void print() {
		display();
	}
	void display() {
		System.out.println('★');
	}
}

public class ChildExample {
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.display();
		
		
	}
}
