package ch09_2_anonymous;

class Person { 
	void wake() { System.out.println("7시에 일어납니다.");}
}

//class ChildPerson extends Person {
//	Person field = new Person() {
//		void work() { System.out.println("출근합니다.");}
//		@Override
//		void wake() {
//			System.out.println("6시에 일어납니다.");
//			work();
//	}
//} 이렇게 적어야 했던것을 아래처럼 적을 수 있다.

class Anonymous {
	Person field = new Person() {	// 사실상 field에 중괄호 안의 모든 내용이 들어간것임.
		void work() { System.out.println("출근합니다.");}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};	// -> 익명객체 선언 Person field = new Person() {}; <- 중괄호,세미콜론. 
	void method1() {
		
		Person localVar = new Person() { 	
			void walk() { System.out.println("산책합니다.");}
			@Override
			void wake() { System.out.println("7시에 일어납니다.");
				walk(); }
		};
		
		localVar.wake();
	}
	void method2(Person person) { 	// 이름없이  person을 매개변수로 사용하겠다는것. 
		person.wake();
	}
}

public class AnonymousExampleClass {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// 익명 객체 필드 사용
		anony.field.wake();
		
		// 익명 객체 로컬 변수 사용 
		anony.method1();
		
		// 익명 객체 매개값 사용   method1은 내용을 위에서 넣어줬고 method2는 바로 내용을 넣은것이다.
		anony.method2( 
			new Person() { void study() { System.out.println("공부합니다.");}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
			}
		);	// 여기선 {};이렇게 안하는 이유는 method2의 괄호 안에 변수를 넣어주듯이 바로 넣은것이라서 그렇다.
	}
}
