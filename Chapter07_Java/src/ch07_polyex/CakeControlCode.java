package ch07_polyex;

class Cake {
	public void sweet() { System.out.println("Cake.sweet()");}
	public void send() {System.out.println("Cake Sending");}
}
class CheeseCake extends Cake {
	public void milky() {System.out.println("CheeseCake.milky()");}
	@Override
	public void send() {System.out.println("CheeseCake Sending");}
}
class StrawBerryCheeseCake extends CheeseCake {
	public void sour() {System.out.println("StrawBerryCheeseCake.sour()");}
	@Override
	public void send() {System.out.println("StrawBerryCheeseCake Sending");}
}
public class CakeControlCode {
	public static void main(String[] args) {
		
		// StrawBerryCheeseCake 인스턴스는 CheeseCake 인스턴스이면서 Cake인스턴스이다.
		Cake cake1 = new StrawBerryCheeseCake();
		CheeseCake cake2 = new StrawBerryCheeseCake();
		
		cake1.sweet();
		cake2.milky();
		/**
		 * 참조변수 간 대입과 형변환 
		 */
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1;
		
		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ca3; -> 불가능
		CheeseCake ca4 = (CheeseCake)ca3;	// 강제 형변환
		
		/*
		 *
		 * 일괄 처리 (배열 관점에서 정리)
		 */
		Cake[] cakes = new Cake[3];	// 다른 걸 넣고싶으면 new이후의 것만 변경해주면 됌.
		cakes[0] = new Cake();
		cakes[1] = new CheeseCake();
		cakes[2] = new StrawBerryCheeseCake();
		
		for(int i =0; i < cakes.length; i++) {
			// cakes[i] = new CheeseCake();	// 위의 new는 배열만 만든것이라서 배열에 CheeseCake를 넣어주는건 따로 new 해줘야함.
			cakes[i].send();
		}
	}
}
