package Test;

class Car {
	class Tire{}
	static class Engine {}
}

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		//�ν��Ͻ� Ÿ�� �ʵ� �����ϴ¹�
		
		Car.Engine engine = new Car.Engine();
		//����ƽ Ÿ�� �ʵ� �����ϴ¹�.
	}

}
