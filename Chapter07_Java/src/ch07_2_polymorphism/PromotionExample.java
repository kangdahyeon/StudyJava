package ch07_2_polymorphism;
/**
 * 자식클래스는 부모클래스의 모든 자원을 쓸수있다.
 * 자식클래스도 또다른 클래스의 부모 클래스가 될수있다.
 * 부모클래스가 상속받은 자원도 자식 클래스가 쓸수있다.
 * 
 * 부모클래스는 자식클래스의 자원을 쓸수없다.
 * @author KDH
 *
 */

class A {}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
 		E e = new E();
 		
 		A a1 = b;
 		A a2 = c;
 		A a3 = d;
 		A a4 = e;
 		
 		B b1 = d;
 		C c1 = e;
 		
 		//B b3 = e;
 		//C c2 = d;
	}
}
