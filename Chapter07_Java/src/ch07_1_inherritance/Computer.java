package ch07_1_inherritance;

public class Computer extends Calculator {
	//컨트롤 + 스페이스바 하면 부모메소드거 오버라이딩 할거냐고 리스트 나옴.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의  areaCircle() 실행");
		return Math.PI * r * r;
	}
}
