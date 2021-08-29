package ch12_1_multithread;
/*
 *  멀티스레딩의 단점
 * 여러 스레드가 같은 프로세스 내에서 자원을 공유하면서 생기는 문제
 *  - 동기화(synchronization)
 *  - 교착상태(deadlock)
 */

class Calculator {
	private int memory;
	
	public int getMemory() {return memory;}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try { Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " +this.memory);
	}
}

class User1 extends Thread {
	private Calculator calculator;
	
	void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	public void run() {
		calculator.setMemory(100);
	}
}

class User2 extends Thread {
	private Calculator calculator;
	
	void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	public void run() {
		calculator.setMemory(50);
	}
}

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		// 익명객체로 생성한 유저.
		Thread jung = new Thread(){
			@Override
			public void run() {
				calculator.setMemory(100);
				super.run();
			}
		};
		jung.setName("jung's Thread");
		
		Thread park = new Thread (new Runnable() {
			@Override
			public void run() {
				calculator.setMemory(50);
			}
		});
		park.setName("park's Thread");
		
		jung.start();
		park.start();
		
	}
}
