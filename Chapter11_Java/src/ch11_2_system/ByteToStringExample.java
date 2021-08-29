package ch11_2_system;

public class ByteToStringExample {
	public static void main(String[] args) {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		// 6, 4 는 배열의구조에서부터 라서 0부터 세어, 0~6번부터 4개 출력인것. 
		System.out.println(str2);
	}
}
