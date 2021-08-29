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
			// 첫번째 읽고 5라서 for문으로 떨어진다음, 다시 while로 돌아가서 버퍼를 읽었더니 없어서 -1이 나옴. 이때 빠져나온것.
			for(int i = 0; i < rcn; i++) {	// 지금 읽은 갯수만큼 찍기.
				System.out.print(buffer[i]);
			}
		}
		re.close();
	}
}
