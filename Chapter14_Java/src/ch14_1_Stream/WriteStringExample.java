package ch14_1_Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteStringExample {
	public static void main(String[] args) throws Exception {
		
		String path = "C:/Users/KDH/Documents/Dev211/Temp/test10.txt";
		Writer w = new FileWriter(path);
		
		String str = "abcdefg";
		
		w.write(str);
		
		w.flush();
		w.close();
	}
}
