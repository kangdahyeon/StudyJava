package ch14_1_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample_1 {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\test7.txt";
		Reader re = new FileReader(path);
		
		while(true) {
			int data = re.read();
			if(data == -1) break;
			System.out.println((char)data); // char로 형변환 안하면 숫자로 보임.
		}
		re.close();
	}
}
