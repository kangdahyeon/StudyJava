package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FTPClient {
	
	public static final String IP = "localhost";
//	public static final String IP = "127.0.0.1";
	public static final int PORT = 5349;
	
	public static void main(String[] args) {
		System.out.println();
		// ����� ��Ʈ��
		InputStream in = null;
		OutputStream out = null;
		DataInputStream din = null;
		DataOutputStream dout = null;
		FileOutputStream fos = null;
		
		Scanner sc = null;
		// ����
		Socket socket = null;
		
		
		try {
			socket = new Socket(IP,PORT);
			sc = new Scanner(System.in);
			
			// ����
			in = socket.getInputStream();
			din = new DataInputStream(in);
			
			// �۽�
			out = socket.getOutputStream();
			dout = new DataOutputStream(out);
			
			menuDisplay();
			
			String fileName = sc.nextLine();
			
			// ������ ���ϸ��� ������.
			dout.writeUTF(fileName);
			System.out.println(timeStamp() + "���� ������ ��û�Ͽ����ϴ�.");
			
			// ���ϵ����� ����.
			System.out.println("���� �������Դϴ�.");
			System.out.println();
			
			fos = new FileOutputStream("C:/Users/KDH/Documents/Dev211/Temp/" + fileName);
			
			while(true) {
				// �б�
				int data = din.read();
				if(data == -1) break;
				// ����
				fos.write(data);
			} System.out.println();
			System.out.println(timeStamp() + "���� �ٿ�ε� �Ϸ�");
			System.out.println();
			
		} catch(IOException e) {e.printStackTrace();} 
		finally {
			try {
				if(din != null) { din.close();}
				if(dout != null) { dout.close();}
				if(fos != null) { fos.close();}
			} catch(IOException e) {e.printStackTrace();}}
		System.out.println(timeStamp() + " Ŭ���̾�Ʈ ���� ��û ���α׷��� �����մϴ�.");
	}


	private static void menuDisplay() {
		System.out.println();
		System.out.println("���������������������������");
		System.out.println();
		System.out.println(" �ް� ���� ������ �̸�(���ϸ�.Ȯ����)�� �Է��� �ּ���.");
		System.out.println();
		System.out.println(" [1]aaa.txt [2]bbb.txt [3]ccc.txt [4]image.jpg ");
		System.out.println();
		System.out.println("���������������������������");
		System.out.println();
		System.out.print("���� > ");
	}
	
	private static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
}
