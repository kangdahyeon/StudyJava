package ch11_2_system;

public class ValueCompareExample {
	public static void main(String[] args) {
		
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300; // 오토박싱
		Integer obj2 = 300;
		
		System.out.println("==결과 : " +(obj1 == obj2)); // 언박싱
		System.out.println("언박싱후==결과 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals()결과 : " + obj1.equals(obj2)); // Object의 equals를 오버라이딩한것.
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 : " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals()결과 : " + obj3.equals(obj4));
	}
}
