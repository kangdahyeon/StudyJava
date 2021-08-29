package ch14_1_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		
		String path = "C:/Users/KDH/Documents/Dev211/Temp/test3.db";
		// 데이터 도착지를 test1.db로 하는 바이트 기반 파일 출력 스트림을 생성.
		OutputStream os = new FileOutputStream(path);
		
		byte[] array = {10, 20, 30, 40, 50};
		
		os.write(array,1, 3);
		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();	 // 출력 스트림을 닫음
	}
}
