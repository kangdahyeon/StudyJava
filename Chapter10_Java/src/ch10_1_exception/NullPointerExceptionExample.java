package ch10_1_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		String data = null;
		
		try {
			System.out.println(data.toString());
		} catch( NullPointerException e) {
			System.out.println("���ܹ߻�");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("e.printStackTrace()"); // e.printStackTrace�� ��� ���ܻ�Ȳ�� �ɷ��ִ°�.
			e.printStackTrace();
		}
		System.out.println("���α׷� ����"); 
	}
}
