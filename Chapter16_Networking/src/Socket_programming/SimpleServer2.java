package Socket_programming;
/**
 * ���� ��ǻ�ʹ� ���� ���ϰ� Ŭ���̾�Ʈ�� ������ ���� ������ �غ��Ѵ�.
 * ������ ���� ���� ���� ����(accept)�� �����Ű�� Ŭ���̾�Ʈ�� ���ö����� ��ٸ���.
 * Ŭ���̾�Ʈ�� ������ ���� �غ��س��� �ڷḦ Ŭ���̾�Ʈ ������ ������.
 * 
 */

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
	public static void main(String[] args) throws IOException {
		
		String str = "��������ʹ�";
		
		ServerSocket server = new ServerSocket(3480);
		System.out.println("���� �غ� �Ϸ�");
		
		Socket socket = server.accept();	// ���⼭ ����� �Ʒ��� ����ǰ���������.
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		byte[] arr = { 1,2,3,4,5,6,7,8,9,10};
		
		OutputStream out = socket.getOutputStream(); // byte[]�� Ŭ���̾�Ʈ ������ ����
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeUTF(str);
		dos.close();
		out.close();
		
		socket.close();
		server.close();
	}
}
