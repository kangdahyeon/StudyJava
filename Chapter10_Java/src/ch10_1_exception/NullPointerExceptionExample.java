package ch10_1_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		String data = null;
		
		try {
			System.out.println(data.toString());
		} catch( NullPointerException e) {
			System.out.println("예외발생");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("e.printStackTrace()"); // e.printStackTrace는 모든 예외상황을 걸러주는것.
			e.printStackTrace();
		}
		System.out.println("프로그램 종료"); 
	}
}
