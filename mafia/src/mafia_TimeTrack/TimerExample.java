package mafia_TimeTrack;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
	
	public static int count;
	
	public static void main(String[] args) {
		
		System.out.println(TcpApplication.timeStamp());
		
		count = 0;
		Timer m_time = new Timer();
		TimerTask m_task = new TimerTask() {
		int i = 5;
			@Override
			public void run() {
				if(count < 5) {
					System.out.println("���� �Ǿ����ϴ�.");
					count++; i--;
					
					System.out.println("���� �ϼ��� " + i + "�� �Դϴ�.");
					System.out.println(TcpApplication.timeStamp());
					
				} else {
					m_time.cancel();
					System.out.println("����");
				}
			}
		};
		m_time.schedule(m_task, 5000, 60000);
		
	}

}