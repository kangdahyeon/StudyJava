package ch12_2_Test;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			if(this.interrupted()) { break;
			}
		}
	}
}
