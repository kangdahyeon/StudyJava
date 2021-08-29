package ch12_2_;

import java.util.Arrays;

public class AutoSaveThread extends Thread {
	private int[] arr;
	private int count;
	
	public void AutoSaver(int length) {
		arr = new int[length];
		count = 0;
	}
	
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	@Override
	public void run() {
		int i = 0;
		while(true) {
			try {Thread.sleep(300);} catch(Exception e) {}
			if(count < arr.length -1) {
				save(i++);
			}
		}
	}

	private void save(int num) {
		arr[count++] = num; 
		System.out.println(num + "을 저장합니다.");
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
}
