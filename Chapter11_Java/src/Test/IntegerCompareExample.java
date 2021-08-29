package Test;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);

		/*
		 * 박싱되었을때 -128 ~ 127 이내의 숫자는 숫자 자체의 값으로 비교를 하여
		 * 결과값을 출력하고, -128 ~ 127 이후의 숫자는 주소값을 비교함.
		 */
	}
}
