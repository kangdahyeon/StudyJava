package ch11_2_system;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample2 {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���.";
		
		byte[] bytes1 = str.getBytes(); // -> ���ڸ� ���ڷ� ��ȯ�Ѱ�.
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1); // ���ڷ� �ٲ� ���ڿ��� StringŬ������ ����.
		System.out.println("bytes1->String: " +str1);
		// �⺻ ���ڼ����� ���ڵ��� ���ڵ�.
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR"); // EUC-KR�� ���ڵ�
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUR-KR");
			System.out.println("bytes2->String: " +str2);
			
			byte[] bytes3 = str.getBytes("UTF-8"); // UTF-8�� ���ڵ�
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes2, "UTF-8");
			System.out.println("bytes3->String: " +str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
