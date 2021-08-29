package ch12_1_multithread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask); 러너블을 인터페이스로 구현한거 가지고와서 사용하는것.
		
		Thread thread = new Thread (new Runnable() { 	// 익명객체 만들어서 사용한것.

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i =0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500);} catch(Exception e) {}
				}
			}
		});
		thread.start();
	
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}
}
