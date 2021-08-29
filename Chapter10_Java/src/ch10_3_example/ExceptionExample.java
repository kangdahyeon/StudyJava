package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args)  {
		
		
		try {
			System.out.println(Calculator.div(1000,0));
			System.out.println(Calculator.add(10000, 2));
			
		} catch (BizDividZeroException e) {
			e.printStackTrace();
			
		} catch (BizNegativeNumberException e) {
			System.out.println(e.toString());

		} catch (BizThousandOverException e) {
			System.out.println(e.toString()); 	// 

		} // 무조건 마지막에 들리는곳.
		finally {
			System.out.println("입력값을 확인하세요.");
		}
		
		
		
//		System.out.println(Calculator.sub(5,3));
//		System.out.println(Calculator.multi(1,3));
//		
		
		System.out.println("프로그램 정상 종료");
	}
}
