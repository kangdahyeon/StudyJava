package ch07_1_inherritance;

public class Computer extends Calculator {
	//��Ʈ�� + �����̽��� �ϸ� �θ�޼ҵ�� �������̵� �Ұųİ� ����Ʈ ����.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü��  areaCircle() ����");
		return Math.PI * r * r;
	}
}
