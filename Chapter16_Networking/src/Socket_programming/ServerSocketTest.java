package Socket_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.ServerCloneException;

public class ServerSocketTest {
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(3480);
			
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");
			Socket ClientSocket = serverSocket.accept();	// Ŭ���̾�Ʈ�� ���������� ���� ������ ������.
			System.out.println("����Ǿ����ϴ�." + serverSocket );
			
			ClientSocket.close();
			serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
