package ch09_1_inner;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();	// A안에 속한 B라는 표시를 해줘야함.
		b.field1 = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C(); // static 은 a.new 로 하지않음. static은 원래 new 해줄필요 없는데, A에 속한 C는 해줘야함.. 뭐라는거야
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;	//static변수는 class.변수 로 해줘야함. 
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
