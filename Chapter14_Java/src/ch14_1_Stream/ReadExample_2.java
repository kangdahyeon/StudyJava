package ch14_1_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample_2 {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\test8.txt";
		Reader re = new FileReader(path);
		
		char[] buffer = new char[100];
		
		while(true) {
			int rcn = re.read(buffer);
			if(rcn == -1) break; 	
			// ù��° �а� 5�� for������ ����������, �ٽ� while�� ���ư��� ���۸� �о����� ��� -1�� ����. �̶� �������°�.
			for(int i = 0; i < rcn; i++) {	// ���� ���� ������ŭ ���.
				System.out.print(buffer[i]);
			}
		}
		re.close();
	}
}
