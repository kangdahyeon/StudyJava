package ch11_2_system;

public class StringCharAtExample {
	public static void main(String[] args) {
		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		// case에 정수랑 문자열 가능 
		case '1' :
		case '3' :
			System.out.println("남자 입니다.");
			break;
			
		case '2' :
		case '4' : 
			System.out.println("여자 입니다.");
			break;
		}
	}
}
