package ch11_1;

class A {
	char ch;
	public A(char ch) {
		this.ch = ch;
	}
}

public class StringOrg {
	public static void main(String[] args) {
		
		A type1 = new A('a');
		A type2 = new A('a');
		
		System.out.println(type1);
		System.out.println(type2);
		
		System.out.printf("%X\n",type1.hashCode());
		// %x�� 16���� ǥ���ε�, �빮��X�� �ϸ� �빮�ڷ� ���, �ҹ��ڷ� �ϸ� �ҹ��ڷ� ���~
		
		String str = "korea";
		System.out.println(str.toString());
	}
}
