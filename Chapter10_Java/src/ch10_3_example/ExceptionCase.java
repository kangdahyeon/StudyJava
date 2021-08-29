package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받은 후 나누기실행.
		//입력받은 숫자와 나누기 결과를 출력하시오.
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("a/b -> a?");
			double a = sc.nextDouble();
			System.out.print("a/b -> b?");
			double b = sc.nextDouble();
			if(Double.isInfinite(a / b)) { throw new Exception();} // a/b를 해서 infinite가 나오면 true가 나온다는 뜻.
			System.out.printf("%f / %f = %f\n",a, b, (a/b));
			 
		} catch (InputMismatchException e) {
			System.out.println("사용자 입력 오류 : 숫자를 입력해주세요.");
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
		}
		System.out.println("프로그램 종료");
	}
}
// if(b != 0) {
//	System.out.println( a/b );
//} else {
//	System.out.println("0으로 나눌 수 없습니다.");
//} 
