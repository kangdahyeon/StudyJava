package ch09_1_inner;

public class A3 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C {
		void method() {
			// field1 = 10; -> 인스턴스 멤버는 스태틱 클래스에서 호출불가
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
