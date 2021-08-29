package ch14_2_;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\KDH\\Documents\\Dev211\\Temp\\primitive.db";
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		// DataOutputStream : 밑의 값을 읽어서 파일에 넣어주는것. 
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);	// 개인정보 데이터 클래스를 만든것같은 효과..?
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close();
		
		
		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);
		// DataInputStream 파일의 값을 읽어줌. 
		
		for(int i = 0; i < 2; i ++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
	dis.close();	
	}
}
