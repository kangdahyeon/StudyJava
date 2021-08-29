package example;

public class MultiThread {
	public static void main(String[] args) {
		
		for(int i =0; i < 10; i++) {
			System.out.println(10 - i);
			try {Thread.sleep(1*1000);} catch(Exception e) {}
		}
	}
}
