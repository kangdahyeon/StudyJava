package ch12_2_Test;

public class ThreadExample2 {
	public static void main(String[] args) {
		Thread th = new MovieThread2();
		th.setDaemon(true);
		th.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
	}
}
