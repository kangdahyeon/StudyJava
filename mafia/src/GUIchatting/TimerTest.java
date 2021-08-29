package GUIchatting;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerTest extends JFrame {
	
	JButton button;
	JLabel labelTimer;
	Timer timerSec = new Timer();
	int sec;
	
	public TimerTest() {
		super("TimerTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));	// 2������ ����
		
		labelTimer = new JLabel();
		labelTimer.setFont(new Font("GOTHIC",Font.BOLD, 20)); // ��Ʈ ����
		labelTimer.setHorizontalAlignment(NORMAL);		// �� �߰����� ����
		
		button = new JButton("New Game!!");
		button.addActionListener(new MyActionListener());	// ��ư�� �����ʿ� ���
		
		add(button);
		add(labelTimer);
		setSize(100,100);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			sec = 0; // ��ư�� ���������� �ʸ� 0�ʺ��� �ٽ� ������.
				timerSec.cancel();	//Ÿ�̸� ��ü ���� 
				timerSec = new Timer(); // Ÿ�̸� ��ü �ٽ� ����
			
			timerSec.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					labelTimer.setText("  " + sec + "��");
					sec++;
				}
			},500, 1000);	// run() ������ ��ư ���� ���� 0.5�� ���� ����ǰ� 1�ʸ��� �ݺ��ȴ�. 
		}
	}
	public void main(String[] args) {
		new TimerTest();
	}
}