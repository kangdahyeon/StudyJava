package ch11_2_system;

public class ByteToStringExample {
	public static void main(String[] args) {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		// 6, 4 �� �迭�Ǳ����������� �� 0���� ����, 0~6������ 4�� ����ΰ�. 
		System.out.println(str2);
	}
}
