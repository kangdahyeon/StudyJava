package ch14_1_Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample_3 {
	public static void main(String[] args) throws Exception {
		
		String path = "C:/Users/KDH/Documents/Dev211/Temp/test9.txt";
		Writer w = new FileWriter(path);
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		w.write(array, 1, 3);
		
		w.flush();
		w.close();
	}
}
