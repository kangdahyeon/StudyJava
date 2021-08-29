package ch12_1_multithread;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		Thread th = new BeepThread();
		th.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}
}
