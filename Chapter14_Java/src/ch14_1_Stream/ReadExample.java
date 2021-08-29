package ch14_1_Stream;
/**
 * ���̰� 100�� �迭�� ����. read(byte[]b)�޼ҵ�� ������ �а� ���� �� �� ����.
 * 100�� �̻��� �ƴ϶�� ���� �� �ִ� ����Ʈ �� ��ŭ�� ����.
 * ��) 500����Ʈ��� 100���� ��� 5�� ����.
 * �Ʒ� ������ 3�� �̹Ƿ� 3���� ����.
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
