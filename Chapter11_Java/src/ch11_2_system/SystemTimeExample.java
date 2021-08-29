package ch11_2_system;

public class SystemTimeExample {
	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); // 나노타임 : 경과시간
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에" + (time2 = time1) + "나노초가 소요되었습니다.");
	}
}
