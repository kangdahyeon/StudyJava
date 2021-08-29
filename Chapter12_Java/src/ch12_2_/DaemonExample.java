package ch12_2_;

public class DaemonExample {
	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		if(autoSaveThread.isDaemon()) {
			autoSaveThread.start();
		}
		System.out.println("스레드 수 : " + Thread.activeCount());
		
		try {
			Thread.sleep(5*1000);
		} catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName() + "종료");
	}
}
