package javalang;

import bit.camp.common.BizNegativeNumberException;
import bit.camp.common.BizThousandOverException;
import bit.camp.common.Calculator;


class MyClass {
	
}
public class Program {
	public static void main(String[] args) {
		
	Object o1 = new MyClass();
	
	int var = 1;
	System.out.println(var);
	Integer var2 = new Integer("1"); // Integer�� ���� �ʵ忡 1�� �޾Ƽ� ���õǾ��ִ� ����.
	System.out.println(var2.intValue());
		
		
		
		try {
			Calculator.add(-5, 0);
		} catch (BizThousandOverException e) {
			System.out.println(e.toString());
			
		} catch (BizNegativeNumberException e) {
			System.out.println(e.toString());
		}
	}
}
