package ftp_programming;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	
	public static final int PORT = 5349;
	
	public static void main(String[] args) {
		ServerSocket server= null;
		OutputStream out = null;
		OutputStreamWriter outw = null;
		PrintWriter pw = null;
		FileInputStream fin = null;
		DataOutputStream dout = null;
		
		System.out.println("Ŭ���̾�Ʈ ���� �����");
		try {
			server = new ServerSocket(PORT);
			Socket client = server.accept();
			System.out.println(client.getInetAddress().getHostName() + " ���� �����ϼ̽��ϴ�.");
			out = client.getOutputStream();
			outw = new OutputStreamWriter(out);
			pw = new PrintWriter(outw);
		
			dout = new DataOutputStream(out);
			
			/** ���ҽ� �ڵ� ���� */
			File resce = new File("Resources\\");
			System.out.println(resce.list().length + " ���� ������ �ֽ��ϴ�.");	// ���� ���� ���� Ȯ��
			String filePath = null;
			for(String file : resce.list()) {
				// ���� ����(�̸�,ũ��)���.
				filePath = resce.getName() + "\\" + file;
				File sendFile = new File(filePath);
				System.out.println(sendFile.getName() + " �۽� ��");
				
				// ���� �۽�
				pw.println(sendFile);
				pw.flush();
				pw.println(sendFile.length());
				pw.flush();
				
				fin = new FileInputStream(filePath);
				int cnt = 0;
				for(int i =0; i < sendFile.length(); i++) {
					// ���� �б�
					int data = fin.read();
					// ���� ����
					dout.write(data);
					
					if(cnt % 3000 == 0) { System.out.print("��");}
					cnt++;
				}
				System.out.println("�Ϸ�\n");	// ���� �̸� ���
			}
			fin.close();
			dout.close();
			pw.close();
			client.close();
		} catch(IOException e) {e.printStackTrace();} 
	}
}