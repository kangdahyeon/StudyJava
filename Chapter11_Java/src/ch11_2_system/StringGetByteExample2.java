package ch11_2_system;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample2 {
	public static void main(String[] args) {
		String str = "안녕하세요.";
		
		byte[] bytes1 = str.getBytes(); // -> 문자를 숫자로 변환한것.
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1); // 숫자로 바뀐 문자열을 String클래스에 넣음.
		System.out.println("bytes1->String: " +str1);
		// 기본 문자셋으로 인코딩과 디코딩.
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR"); // EUC-KR로 디코딩
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUR-KR");
			System.out.println("bytes2->String: " +str2);
			
			byte[] bytes3 = str.getBytes("UTF-8"); // UTF-8로 디코딩
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes2, "UTF-8");
			System.out.println("bytes3->String: " +str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
