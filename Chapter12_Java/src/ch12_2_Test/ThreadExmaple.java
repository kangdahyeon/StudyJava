package ch12_2_Test;

public class ThreadExmaple {
	public static void main(String[] args) {
		Thread th = new MovieThread();
		th.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		th.interrupt();
		System.out.println("프로그램종료");
	}
}
