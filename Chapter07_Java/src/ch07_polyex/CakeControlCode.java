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
		
		// StrawBerryCheeseCake �ν��Ͻ��� CheeseCake �ν��Ͻ��̸鼭 Cake�ν��Ͻ��̴�.
		Cake cake1 = new StrawBerryCheeseCake();
		CheeseCake cake2 = new StrawBerryCheeseCake();
		
		cake1.sweet();
		cake2.milky();
		/**
		 * �������� �� ���԰� ����ȯ 
		 */
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1;
		
		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ca3; -> �Ұ���
		CheeseCake ca4 = (CheeseCake)ca3;	// ���� ����ȯ
		
		/*
		 *
		 * �ϰ� ó�� (�迭 �������� ����)
		 */
		Cake[] cakes = new Cake[3];	// �ٸ� �� �ְ������ new������ �͸� �������ָ� ��.
		cakes[0] = new Cake();
		cakes[1] = new CheeseCake();
		cakes[2] = new StrawBerryCheeseCake();
		
		for(int i =0; i < cakes.length; i++) {
			// cakes[i] = new CheeseCake();	// ���� new�� �迭�� ������̶� �迭�� CheeseCake�� �־��ִ°� ���� new �������.
			cakes[i].send();
		}
	}
}
