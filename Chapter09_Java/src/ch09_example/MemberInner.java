package ch09_example;

class Outter {
	int num = 0;
	class Member {	//Outter �ȿ����� �� Ŭ������.(�ν��Ͻ�)
		
		//�޼ҵ�
		void add(int n) {
		num += n;
		}
		
		int getNum() {
			return num;
		}
	}
}

public class MemberInner {
	public static void main(String[] args) {
		//Outter Ŭ���� ���� �ν��Ͻ� �Ѵ�. 
		Outter o1 = new Outter();
		Outter o2 = new Outter();
		
		
		//o1������� �� �ν��Ͻ��� ����
		Outter.Member o1m1 = o1.new Member();
		Outter.Member o1m2 = o1.new Member();
		
		//o2������� �� �ν��Ͻ��� ����
		Outter.Member o2m1 = o2.new Member();
		Outter.Member o2m2 = o2.new Member();
		
		//o1������� ������ �� �ν��Ͻ��� �޼ҵ� ȣ��
		o1m1.add(5);
		System.out.println(o1m1.getNum());
		//o2������� ������ �� �ν��Ͻ��� �޼ҵ� ȣ��
		o2m1.add(7);
		System.out.println(o2m2.getNum()); 
		/* o2m1���� Outter�� num�� 7�� ��������. �׷��� ���� o2m2�� num����
		������ ���� Outter�� num �� 7�� ����ϰ� �ȴ� -> Outter�� num�� �� �ν��Ͻ��� �����Ѵ�.*/ 
	}
}
