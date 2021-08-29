package ch10_3_example;

public class BizNegativeNumberException extends Exception {
	@Override
	public String toString() {
		return "결과값이 음수입니다.";
	}
}
