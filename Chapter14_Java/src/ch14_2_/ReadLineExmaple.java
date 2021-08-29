package ch14_2_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExmaple {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(ReadLineExmaple.class.getResource("language.txt").getPath());
		
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine(); // ���پ� �ݺ��ؼ� �а�, null�� ������ ����.
			if(data == null) break;
			System.out.println(data);
		}
		br.close();
	}
}
