package ch14_2_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConverStreamExample {
	public static String path = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\test7.txt";
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream(path);
		Writer writer = new OutputStreamWriter(fos);	// Output어쩌구가 보조스트림이고 Writer를 보는순간 문자겠거니 해야함.
		
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {

		FileInputStream fis = new FileInputStream(path);
		Reader reader = new InputStreamReader(fis);
		
		char[]buffer = new char[100];
		int readCharNum = reader.read(buffer); // reader 인트형(바이트를 읽었다) 다읽으면 -1 리턴
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
