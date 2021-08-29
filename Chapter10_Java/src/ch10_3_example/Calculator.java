package ch10_3_example;

public class Calculator {
	
	//업무적으로 x,y값은 1000을 넘으면 에러
	public static int add(int x, int y) throws BizThousandOverException, BizNegativeNumberException { 
		int result = x + y;
		if(result > 1_000) {
			throw new BizThousandOverException();
		} 
		if(result < 0) {
			throw new BizNegativeNumberException();
		} return result;}

	//업무적으로 x-y 값이 음수이면 에러.
	public static int sub(int x, int y) throws BizNegativeNumberException {
		int result = x - y;
		if(result < 0 ) {
			throw new BizNegativeNumberException();
		} return result;}

	public static int multi(int x, int y) {return x * y;}
	
	// y가 0이면 에러.
	public static int div(int x, int y) throws BizDividZeroException {
		int result = x / y;
		if(y == 0) {
			throw new BizDividZeroException();
		} return x / y;}
}
