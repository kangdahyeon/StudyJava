package ch12_1_multithread;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
/**
 * 스레드를 만드는 방법 extends 랑 implements 두가지 있음.
 * 
 */
