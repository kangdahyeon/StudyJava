package ch07_2_polymorphism2;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); -> 호출불가능.
		
	}
}
