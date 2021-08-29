package Socket_programming;
/**
 * 서버 컴퓨터는 서버 소켓과 클라이언트의 소켓을 받을 소켓을 준비한다.
 * 소켓을 열어 서버 연결 동의(accept)를 실행시키면 클라이언트가 들어올때까지 기다린다.
 * 클라이언트가 들어오면 내가 준비해놓은 자료를 클라이언트 서버에 보낸다.
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
		System.out.println("서버 준비 완료");
		
		Socket socket = server.accept();	
		System.out.println("클라이언트 연결 완료");
		
		// 클라이언트 IP주소
		System.out.println(socket.getInetAddress());
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		while(true) {
			String userMsg = dis.readUTF();
			System.out.print("사용자 메시지 : " + userMsg);
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
