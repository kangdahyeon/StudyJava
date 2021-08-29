package ch10_3_example;

public class Calculator {
	
	//���������� x,y���� 1000�� ������ ����
	public static int add(int x, int y) throws BizThousandOverException, BizNegativeNumberException { 
		int result = x + y;
		if(result > 1_000) {
			throw new BizThousandOverException();
		} 
		if(result < 0) {
			throw new BizNegativeNumberException();
		} return result;}

	//���������� x-y ���� �����̸� ����.
	public static int sub(int x, int y) throws BizNegativeNumberException {
		int result = x - y;
		if(result < 0 ) {
			throw new BizNegativeNumberException();
		} return result;}

	public static int multi(int x, int y) {return x * y;}
	
	// y�� 0�̸� ����.
	public static int div(int x, int y) throws BizDividZeroException {
		int result = x / y;
		if(y == 0) {
			throw new BizDividZeroException();
		} return x / y;}
}
