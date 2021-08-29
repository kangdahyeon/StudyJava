package ch07_2_polymorphism3;

/**
 * 100까지의 난수 중에서 50개의 짝수만 출력하시오. 
 * @author KDH
 *
 */

public class Test {
	public static void main(String[] args) {
		for(int i =0; i < 50; i++) {
			int var = (int)(Math.random() * 100) + 1;
			if(var % 2 == 0) {
				System.out.print(var + ", ");
			}
		}
	}
}
