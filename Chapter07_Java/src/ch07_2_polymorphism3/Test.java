package ch07_2_polymorphism3;

/**
 * 100������ ���� �߿��� 50���� ¦���� ����Ͻÿ�. 
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
