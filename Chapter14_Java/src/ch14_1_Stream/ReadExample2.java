package ch14_1_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\test1.db";
		InputStream is = new FileInputStream(path);
		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
		is.close();
	}
}
