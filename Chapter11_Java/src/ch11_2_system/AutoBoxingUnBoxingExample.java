package ch11_2_system;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		
		Integer obj = 100; // 오토박싱
		System.out.println("value : " + obj.intValue());
		
		int value = obj; // 변수에 참조변수를 대입. 자동언박싱.
		System.out.println("value : " + value);
		
		int result = obj + 100;
		System.out.println("result : " + result);
	}
}
