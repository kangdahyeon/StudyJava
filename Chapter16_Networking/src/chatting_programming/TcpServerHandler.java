package chatting_programming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

import com.framework.TcpApplication;

/**
 * AppServer로 부터 전달 받은 소켓을 이용하여 
 * 클라이언트의 접속 정보 및 송수신 기능을 관리한다.
 * @author KDH
 *
 */
public class TcpServerHandler implements Runnable {
	
	/* 클라이언트 ID를 키(K)로 하는 출력(V)을 위한 맵 자료구조 */
	public static HashMap<String, PrintWriter> sendMap = new HashMap<>();	
	
	// 클라이언트와 연결된 소켓 객체
	private Socket sock;
	
	// 클라이언트 IP 주소
	private String cAddr;
	
	// 클라이언트 ID
	private String id;
	
	
	/* 생성자 : 받아 온 소켓을 맵에 저장 */
	public TcpServerHandler(Socket cSocket) {
		this.sock = cSocket;
		this.cAddr = sock.getInetAddress().getHostAddress();
	}

	/* 참여자 입퇴실 관리 / 브로드캐스팅  / 참여자 송수신 관리*/ 
	@Override
	public void run() {
		try {
			// 1. 송신 스트림 얻기
			PrintWriter pw = new PrintWriter(
							 new OutputStreamWriter(
							 sock.getOutputStream()));
			// 2. 수신 스트림 얻기
			BufferedReader br = new BufferedReader(
								new InputStreamReader(
								sock.getInputStream()));
			
			// 3. 클라이언트 접속 정보 저장 및 브로드캐스팅
			id = br.readLine();
			TcpServerHandler.sendMap.put(id, pw);
			
			// 4. 클라이언트 입장정보를 브로드캐스팅
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + "[" + id + "] 님이 들어오셨습니다.");
			
			System.out.println(TcpApplication.timeStamp() + cAddr + " ◁ connected"); 
			System.out.println(TcpApplication.timeStamp() + "참여인원 : " + sendMap.size() + "명");
			
			// 5. 수신/ 송신 
			String line = null;
			while((line = br.readLine()) != null) {
				// 퇴장하는 경우
				if(line.equalsIgnoreCase("/quit")) {
					// 퇴장정보 브로드 캐스팅
					TcpServerHandler.broadCast(TcpApplication.timeStamp() + "[" + id + "] 님이 나가셨습니다.");
					break;
				}
				// 귓속말 하는 경우
				else if(line.indexOf("/to") > - 1) {
					// 귓속말 메소드 호출 
					whisper(id, line);
					
				}
				// 일반 메시지 전송
				else {
					String msg = "[" + id + "]" + " " + line;
					TcpServerHandler.broadCast(msg);
				}
			}
			// 퇴장하는 경우 처리
			System.out.println(TcpApplication.timeStamp() + cAddr + " ◁  disconnected");
			
			// 맵 삭제
			TcpServerHandler.sendMap.remove(id);
			System.out.println(TcpApplication.timeStamp() + "참여인원 : " + sendMap.size() + "명");
			
			pw.close();
			br.close();
			sock.close();
			
		} catch(IOException e) {
			e.printStackTrace();
			} finally {
				
			}
	}
	
	/* 귓속말 전송 메소드 -> /to 아이디 내용 이렇게 적을 예정. 
	 * name : 보내는 클라이언트 ID , msg : 보낼 메세지. */
	private void whisper(String name, String msg) {
		int start = msg.indexOf(" ") + 1; 			// 시작 위치는 첫 공백의 다음칸부터임. 
		int   end = msg.indexOf(" ", start);		// start위치부터 다음 공백이 나오는 위치 
		
		if(end != -1) {
			// 아래의 id 는 보낼 사람것.
			String     id = msg.substring(start, end);	// indexof의 시작위치와 끝 위치를 추출.
			String secret = msg.substring(end + 1);		// 시작점만 알려주면 문자열 끝까지 추출.
			
			// sendMap 으로 부터 키 <ID>에 해당하는 PrintWriter 객체를 얻어온다.
			PrintWriter pw = TcpServerHandler.sendMap.get(id);
			// 메시지 전송
			if(pw != null) {
				pw.println("[" + name + "님의 귓속말 ]" +secret);
				pw.flush();
				
			}
		}
	}
	
	/* 메시지 일괄 전송 메소드  : 모든 참여자에게 일괄적으로 전송 */
	public static void broadCast(String message) {
		synchronized (sendMap) {
			
			// 접속한 모든 클라이언트들에게 메시지 전달.
			for(PrintWriter cpw : TcpServerHandler.sendMap.values()) {
				cpw.println(message);
				cpw.flush();
			}
		}
	}
}
