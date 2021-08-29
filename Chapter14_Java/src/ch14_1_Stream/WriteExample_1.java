package ch14_1_Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample_1 {
	public static void main(String[] args) throws Exception {
		
		String path = "C:/Users/KDH/Documents/Dev211/Temp/test8.txt";
		Writer w = new FileWriter(path);
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		w.write(array);
		
		w.flush();
		w.close();
	}
}
