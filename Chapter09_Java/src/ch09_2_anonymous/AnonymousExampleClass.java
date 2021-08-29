package ch09_2_anonymous;

class Person { 
	void wake() { System.out.println("7�ÿ� �Ͼ�ϴ�.");}
}

//class ChildPerson extends Person {
//	Person field = new Person() {
//		void work() { System.out.println("����մϴ�.");}
//		@Override
//		void wake() {
//			System.out.println("6�ÿ� �Ͼ�ϴ�.");
//			work();
//	}
//} �̷��� ����� �ߴ����� �Ʒ�ó�� ���� �� �ִ�.

class Anonymous {
	Person field = new Person() {	// ��ǻ� field�� �߰�ȣ ���� ��� ������ ������.
		void work() { System.out.println("����մϴ�.");}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};	// -> �͸�ü ���� Person field = new Person() {}; <- �߰�ȣ,�����ݷ�. 
	void method1() {
		
		Person localVar = new Person() { 	
			void walk() { System.out.println("��å�մϴ�.");}
			@Override
			void wake() { System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk(); }
		};
		
		localVar.wake();
	}
	void method2(Person person) { 	// �̸�����  person�� �Ű������� ����ϰڴٴ°�. 
		person.wake();
	}
}

public class AnonymousExampleClass {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		
		// �͸� ��ü ���� ���� ��� 
		anony.method1();
		
		// �͸� ��ü �Ű��� ���   method1�� ������ ������ �־���� method2�� �ٷ� ������ �������̴�.
		anony.method2( 
			new Person() { void study() { System.out.println("�����մϴ�.");}
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
			}
		);	// ���⼱ {};�̷��� ���ϴ� ������ method2�� ��ȣ �ȿ� ������ �־��ֵ��� �ٷ� �������̶� �׷���.
	}
}
