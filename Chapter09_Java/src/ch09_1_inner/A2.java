package ch09_1_inner;

public class A2 {
	/** �ν��Ͻ� ��� Ŭ���� **/
	class B2 {}
	
	/** ���� ��� Ŭ���� **/
	static class C2 {}

	//�ν��Ͻ� �ʵ�
	B2 field1 = new B2();
	C2 field2 = new C2();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B2 var1 = new B2();
		C2 var2 = new C2();
	}
	
	//����ƽ �ʵ� �ʱ�ȭ
	// static B2 field3 = new B2(); -> �ν��Ͻ� ����� ����ƽ �ʵ忡 ���� �� ����. 
	static C2 field4 = new C2();
	
	//����ƽ �޼ҵ�
	static void method2() {
		// B2 var1 = new B2(); -> �ν��Ͻ� ����� ����ƽ �޼ҵ忡 ���� �� ����.
		C2 var2 = new C2();
	}
}
