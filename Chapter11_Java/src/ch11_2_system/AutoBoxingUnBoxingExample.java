package ch11_2_system;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		
		Integer obj = 100; // ����ڽ�
		System.out.println("value : " + obj.intValue());
		
		int value = obj; // ������ ���������� ����. �ڵ���ڽ�.
		System.out.println("value : " + value);
		
		int result = obj + 100;
		System.out.println("result : " + result);
	}
}
