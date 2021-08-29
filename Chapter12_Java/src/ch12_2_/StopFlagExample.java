package ch12_2_;
class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		while(!stop) {
			System.out.println("���� ��");
		}
		 System.out.println("�ڿ� ����");
		 System.out.println("���� ����");
	}
}

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(2*1000);} catch(Exception e) {}
		
		printThread.setStop(true);
	}
}
