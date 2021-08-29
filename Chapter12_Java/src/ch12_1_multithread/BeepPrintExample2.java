package ch12_1_multithread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask); ���ʺ��� �������̽��� �����Ѱ� ������ͼ� ����ϴ°�.
		
		Thread thread = new Thread (new Runnable() { 	// �͸�ü ���� ����Ѱ�.

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
			System.out.println("��");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}
}
