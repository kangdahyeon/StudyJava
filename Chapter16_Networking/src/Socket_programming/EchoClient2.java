package Socket_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
	Socket socket = new Socket("localhost", 3480);
	System.out.println("서버연결 완료");
	
	// 데이터전송
	OutputStream out = socket.getOutputStream();
	DataOutputStream dos = new DataOutputStream(out);
	
	// 데이터 수신
	InputStream in = socket.getInputStream();
	DataInputStream dis = new DataInputStream(in);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("서버로 전송할 메세지를 입력해 주세요");
	
	while(true) {
		System.out.println("> ");
		String sendmsg = sc.nextLine();	 
		dos.writeUTF(sendmsg);
		dos.flush();
		
		String readMsg = dis.readUTF();
		System.out.println("서버응답> " + readMsg);
		
		if(sendmsg.equalsIgnoreCase("exit")) break;
	}
	
	
	
	
//	String message = dis.readUTF();
//	System.out.println("받은 메시지 : " + message);
//	
	dis.close();
	dos.close();
	sc.close();	
	socket.close();
	
	System.out.println("클라이언트 종료");
	}
}
