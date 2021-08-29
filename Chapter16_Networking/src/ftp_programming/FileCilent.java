package ftp_programming;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileCilent {
	public static final String IP = "192.168.0.17";
	public static final int PORT = 5349;
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		Socket socket = new Socket(IP, PORT);
		
		InputStream in = socket.getInputStream();
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(inr);
		
		DataInputStream din = new DataInputStream(in);
		FileOutputStream fout = null;
		
		while(true) {
			// ���� �̸� ����
			String strLine = br.readLine();
			String strLength = br.readLine();
			
			if(strLine == null) break;
			System.out.println(strLine + " ���� ������");
			System.out.println("����ũ�� : " + strLength);
			
			String path = "C:/Users/KDH/Documents/Dev211/Temp/Download/" + strLine;
			fout = new FileOutputStream(path);
			
			int cnt = 0;
			for(int i =0; i < Integer.parseInt(strLength); i++) {
				// ���� ����
				int data = din.read();
				// ���� ����
				fout.write(data);
				
				if(cnt % 3000 == 0) { System.out.print("��");}
				cnt++;
			}
			System.out.println("�Ϸ�\n");	
		}
		fout.close();
		din.close();
		br.close();
		socket.close();
		
		System.out.println();
		System.out.println("���� ��û ���α׷��� �����մϴ�.");
	}
}