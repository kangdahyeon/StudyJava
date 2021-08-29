package ch14_1_Stream;
/**
 * 길이가 100인 배열을 생성. read(byte[]b)메소드로 꺼번에 읽고 저장 할 수 있음.
 * 100개 이상이 아니라면 읽을 수 있는 바이트 수 만큼씩 읽음.
 * 예) 500바이트라면 100개씩 끊어서 5번 읽음.
 * 아래 예제는 3개 이므로 3개를 읽음.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\test2.db";
		InputStream is = new FileInputStream(path);
		byte[] buffer = new byte[100];
		
		while(true) {
			int rbn = is.read(buffer);
			if(rbn == -1) break;
			for(int i = 0; i < rbn; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
