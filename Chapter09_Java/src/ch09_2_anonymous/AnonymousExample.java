package ch09_2_anonymous;

interface Calculatable {
	public int sum();
}

class Anonymous3 {
	private int field;
	
	public void method(final int arg1, int arg2) { // arg2도 final이 붙은걸로 처리된다.
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
//		arg1 = 20;
//		arg2 = 20;
//		
//		var1 = 30;
//		var2 = 30;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous3 anony = new Anonymous3();
		anony.method(0, 0);
	}
}
