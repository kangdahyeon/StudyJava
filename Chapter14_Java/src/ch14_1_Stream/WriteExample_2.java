package ch14_1_Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample_2 {
	public static void main(String[] args) throws Exception {
		
		String path = "C:/Users/KDH/Documents/Dev211/Temp/test7.txt";
		Writer w = new FileWriter(path);
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		w.write(a);
		w.write(b);
		w.write(c);
		
		w.flush();
		w.close();
	}
}
