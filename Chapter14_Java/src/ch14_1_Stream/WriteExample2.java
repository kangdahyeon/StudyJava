package ch14_1_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		
		String path = "C:/Users/KDH/Documents/Dev211/Temp/test3.db";
		// ������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����.
		OutputStream os = new FileOutputStream(path);
		
		byte[] array = {10, 20, 30, 40, 50};
		
		os.write(array,1, 3);
		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close();	 // ��� ��Ʈ���� ����
	}
}
