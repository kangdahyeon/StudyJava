package mafia_TimeTrack;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() { 
		setTitle("첫번째 프레임"); 
		setSize(300,400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
		}

	public static void main(String[] args) {
		new MyFrame();
	}
}
