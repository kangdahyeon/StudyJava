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

		} // ������ �������� �鸮�°�.
		finally {
			System.out.println("�Է°��� Ȯ���ϼ���.");
		}
		
		
		
//		System.out.println(Calculator.sub(5,3));
//		System.out.println(Calculator.multi(1,3));
//		
		
		System.out.println("���α׷� ���� ����");
	}
}
