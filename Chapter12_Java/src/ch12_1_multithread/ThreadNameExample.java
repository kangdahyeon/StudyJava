package ch12_1_multithread;
class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
		System.out.println(getName() + "�� ����� ����");
		}
	}
}
public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();
	}
}
