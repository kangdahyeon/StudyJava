package Socket_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.ServerCloneException;

public class ServerSocketTest {
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(3480);
			
			System.out.println("클라이언트 연결 대기 중");
			Socket ClientSocket = serverSocket.accept();	// 클라이언트의 접속정보를 담은 소켓을 리턴함.
			System.out.println("연결되었습니다." + serverSocket );
			
			ClientSocket.close();
			serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
