package ch07_2_polymorphism;

class Parent {
	//�ʵ�
	String p_str = "Parent String";
	
	//������
	//�޼ҵ�
	void print() {
		System.out.println(p_str);
	}
}

class Child extends Parent {
	//�ʵ�
	String S_str = "Child String";
	//������
	//�޼ҵ�
	
	@Override
	void print() {
		display();
	}
	void display() {
		System.out.println('��');
	}
}

public class ChildExample {
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.display();
		
		
	}
}
