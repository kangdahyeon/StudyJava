package ch11_2_system;

class Car{}

public class ClassExample {
	public static void main(String[] args) {
		// ��ü ���� ��� ù��° ���
		Class clazz = Car.class;
		// �ι�° ���
//		Class clazz = Class.forName("sec01.exam08.Car");
//		// ����° ���
//		Car car = new Car();
//		Class clazz = Car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
}
