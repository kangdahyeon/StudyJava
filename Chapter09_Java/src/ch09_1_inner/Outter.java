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
			System.out.println(this.field);		// -> nested필드 참조함. (위치가 안이라서 그런가?)
			this.method();
			
			System.out.println(Outter.this.field);//Outter는 Outter.this로 따로 표기해줘야함.
			Outter.this.method();
		}
	}
}
