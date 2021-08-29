package ch09_example;

class Outter {
	int num = 0;
	class Member {	//Outter 안에서만 쓸 클래스임.(인스턴스)
		
		//메소드
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
		//Outter 클래스 먼저 인스턴스 한다. 
		Outter o1 = new Outter();
		Outter o2 = new Outter();
		
		
		//o1기반으로 두 인스턴스를 생성
		Outter.Member o1m1 = o1.new Member();
		Outter.Member o1m2 = o1.new Member();
		
		//o2기반으로 두 인스턴스를 생성
		Outter.Member o2m1 = o2.new Member();
		Outter.Member o2m2 = o2.new Member();
		
		//o1기반으로 생성된 두 인스턴스의 메소드 호출
		o1m1.add(5);
		System.out.println(o1m1.getNum());
		//o2기반으로 생성된 두 인스턴스의 메소드 호출
		o2m1.add(7);
		System.out.println(o2m2.getNum()); 
		/* o2m1에서 Outter의 num을 7로 변경했음. 그러고 나서 o2m2로 num값을
		가지고 오면 Outter의 num 인 7을 출력하게 된다 -> Outter의 num은 두 인스턴스가 공유한다.*/ 
	}
}
