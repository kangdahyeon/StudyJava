package mafia_TimeTrack;

import java.util.Timer;
import java.util.TimerTask;

public class DayCountExample { 
	int count = 0;
	int i = 5;
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		

		@Override
		public void run() {
			System.out.println(TcpApplication.timeStamp());
			
			if(count < 5) {
				System.out.println("밤이 되었습니다.");
				count++; i--;
				
				System.out.println("남은 일수는 " + i + "일 입니다.");
				System.out.println(TcpApplication.timeStamp());
				
			} else {
				timer.cancel();
				System.out.println("종료");
			}
		}
	};	
	public void start() {
		timer.schedule(task, 5000,60000);
	}
}
