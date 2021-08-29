package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		// �� ������ ����ڷκ��� �Է¹��� �� ���������.
		//�Է¹��� ���ڿ� ������ ����� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("a/b -> a?");
			double a = sc.nextDouble();
			System.out.print("a/b -> b?");
			double b = sc.nextDouble();
			if(Double.isInfinite(a / b)) { throw new Exception();} // a/b�� �ؼ� infinite�� ������ true�� ���´ٴ� ��.
			System.out.printf("%f / %f = %f\n",a, b, (a/b));
			 
		} catch (InputMismatchException e) {
			System.out.println("����� �Է� ���� : ���ڸ� �Է����ּ���.");
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
		}
		System.out.println("���α׷� ����");
	}
}
// if(b != 0) {
//	System.out.println( a/b );
//} else {
//	System.out.println("0���� ���� �� �����ϴ�.");
//} 
