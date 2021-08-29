package Socket_programming;
/**
 * 서버 컴퓨터는 서버 소켓과 클라이언트의 소켓을 받을 소켓을 준비한다.
 * 소켓을 열어 서버 연결 동의(accept)를 실행시키면 클라이언트가 들어올때까지 기다린다.
 * 클라이언트가 들어오면 내가 준비해놓은 자료를 클라이언트 서버에 보낸다.
 * 
 */

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(3480);
		System.out.println("서버 준비 완료");
		
		Socket socket = server.accept();	// 여기서 대기중 아래는 실행되고있지않음.
		System.out.println("클라이언트 연결 완료");
		
		byte[] arr = { 1,2,3,4,5,6,7,8,9,10};
		
		OutputStream out = socket.getOutputStream(); // byte[]을 클라이언트 서버에 전달
		
		out.write(arr);
		out.flush();
		out.close();
		
		socket.close();
		server.close();
	}
}
