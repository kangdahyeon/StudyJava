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
		// %x는 16진수 표현인데, 대문자X로 하면 대문자로 출력, 소문자로 하면 소문자로 출력됌~
		
		String str = "korea";
		System.out.println(str.toString());
	}
}
