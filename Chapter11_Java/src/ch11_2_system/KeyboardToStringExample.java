package ch11_2_system;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		
		// ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		byte[] bytes = new byte[100];
		
		System.out.print("�Է� : ");
		int readByteNo;
		try {
			// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
			readByteNo = System.in.read(bytes);
			
			// �迭�� ���ڿ��� ��ȯ
			String str = new String(bytes, 0, readByteNo-2);
			// -2�� �����Է� ������ 
			
			System.out.println(str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
}
