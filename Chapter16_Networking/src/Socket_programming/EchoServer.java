package Socket_programming;
/**
 * ���� ��ǻ�ʹ� ���� ���ϰ� Ŭ���̾�Ʈ�� ������ ���� ������ �غ��Ѵ�.
 * ������ ���� ���� ���� ����(accept)�� �����Ű�� Ŭ���̾�Ʈ�� ���ö����� ��ٸ���.
 * Ŭ���̾�Ʈ�� ������ ���� �غ��س��� �ڷḦ Ŭ���̾�Ʈ ������ ������.
 * 
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		
		
		ServerSocket server = new ServerSocket(3480);
		System.out.println("���� �غ� �Ϸ�");
		
		Socket socket = server.accept();	
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		// Ŭ���̾�Ʈ IP�ּ�
		System.out.println(socket.getInetAddress());
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		while(true) {
			String userMsg = dis.readUTF();
			System.out.print("����� �޽��� : " + userMsg);
			if(userMsg.equalsIgnoreCase("exit")) break;
			
		}
		
//		OutputStream out = socket.getOutputStream(); 
//		DataOutputStream dos = new DataOutputStream(out);
		
		
		dis.close();
		in.close();
		
		socket.close();
		server.close();
	}
}
