package ch09_1_inner;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-field");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);		// -> nested�ʵ� ������. (��ġ�� ���̶� �׷���?)
			this.method();
			
			System.out.println(Outter.this.field);//Outter�� Outter.this�� ���� ǥ���������.
			Outter.this.method();
		}
	}
}
