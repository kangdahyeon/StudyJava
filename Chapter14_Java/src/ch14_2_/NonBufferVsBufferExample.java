package ch14_2_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 =
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath(); 
		// C:\Users\KDH\eclipse-workspace\Study_Java\Chapter14_Java\bin\ch14_2_Streamlib 		이 경로에 있는 jpg파일을 
		String targetFilePath1 = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\originalFile1.jpg"; // 이쪽으로 옮김.
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 =
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\originalFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println(("버퍼를 사용하지 않았을 때  : \t") + nonBufferTime + "ns");
		
		long bufferTime = copy(bis,bos);
		System.out.println("버퍼를 사용했을 때 : \t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws IOException, InterruptedException {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.wait(data);
		}
		os.flush();
		long end = System.nanoTime();
		return(end-start);
	}
}
