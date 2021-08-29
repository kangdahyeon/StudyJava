package ch14_1_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		String path = "C:/Users/KDH/Documents/Dev211/Temp/test1.db";
		// ������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����.
		OutputStream os = new FileOutputStream(path);
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close();	 // ��� ��Ʈ���� ����
	}
}
