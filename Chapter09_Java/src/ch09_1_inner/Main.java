package ch09_1_inner;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();	// A�ȿ� ���� B��� ǥ�ø� �������.
		b.field1 = 3;
		b.method1();
		
		// ���� ��� Ŭ���� ��ü ����
		A.C c = new A.C(); // static �� a.new �� ��������. static�� ���� new �����ʿ� ���µ�, A�� ���� C�� �������.. ����°ž�
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;	//static������ class.���� �� �������. 
		A.C.method2();
		
		// ���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
