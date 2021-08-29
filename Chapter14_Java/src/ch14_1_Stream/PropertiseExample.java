package ch14_1_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class PropertiseExample {
	public static void main(String[] args) {
		/**
		 * [Properties] 외부 설정파일 읽어오기 
		 *  - "=" 또는 ":" 로 연결된 형태여야함.
		 *  - 주석라인은 첫번째 문자가 '#' 이어야 한다.
		 *  - 경로'/'
		 */
		String path = "src/ch14_1_Stream/input.txt";
		Properties settings = new Properties();
		
		try {
			settings.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		String eName = settings.getProperty("eng_name");
		System.out.println(eName);
		
		String kName = settings.getProperty("kor_name");
		try {
			kName = new String(kName.getBytes("8859_1"),"EUC-KR");
		} catch (UnsupportedEncodingException e) {}
		
		System.out.println(kName);
		String[] data = settings.getProperty("data").split(",");
		System.out.println(Arrays.toString(data));
		
		
		settings.list(System.out);
	}
}
