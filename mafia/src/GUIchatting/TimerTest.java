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
		setLayout(new GridLayout(2,1));	// 2행으로 설정
		
		labelTimer = new JLabel();
		labelTimer.setFont(new Font("GOTHIC",Font.BOLD, 20)); // 폰트 설정
		labelTimer.setHorizontalAlignment(NORMAL);		// 라벨 중간으로 정렬
		
		button = new JButton("New Game!!");
		button.addActionListener(new MyActionListener());	// 버튼을 리스너에 등록
		
		add(button);
		add(labelTimer);
		setSize(100,100);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			sec = 0; // 버튼이 눌릴때마다 초를 0초부터 다시 보여줌.
				timerSec.cancel();	//타이머 객체 종료 
				timerSec = new Timer(); // 타이머 객체 다시 생성
			
			timerSec.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					labelTimer.setText("  " + sec + "초");
					sec++;
				}
			},500, 1000);	// run() 내용이 버튼 누른 순간 0.5초 이후 실행되고 1초마다 반복된다. 
		}
	}
	public void main(String[] args) {
		new TimerTest();
	}
}
