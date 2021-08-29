package Test;

class Car {
	class Tire{}
	static class Engine {}
}

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		//인스턴스 타입 필드 선언하는법
		
		Car.Engine engine = new Car.Engine();
		//스태틱 타입 필드 선언하는법.
	}

}
