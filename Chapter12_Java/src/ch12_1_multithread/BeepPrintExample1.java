package ch12_1_multithread;

import java.awt.Toolkit;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
	setTitle("나의 윈도우 프레임");
	setSize(300,500);
	setVisible(true);
	}
}

public class BeepPrintExample1 {
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		new MyFrame();
		
		for(int i =0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}
}
