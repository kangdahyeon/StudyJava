package summary;
/**
 * [����� ��Ʈ��]
 *  - ����Ʈ ��� ��Ʈ�� 
 *  	InputStream, OutputStream : �ֻ��� ��Ʈ���̸�, ���� ��Ʈ���� Ŭ���� ���̻�� ����.
 *  
 *  - ���� ��� ��Ʈ��
 *  	Reader, Writer : �ֻ��� ��Ʈ���̸�, ���� ��Ʈ���� Ŭ���� ���̻�� ����.
 *  
 * [������Ʈ��]
 * 	�ٸ� ��Ʈ���� ����Ǿ� ����� �������ִ� ��Ʈ��.->������Ʈ���� ��ǲ �ƿ�ǲ �ڿ� �̸��� �ٴµ�..?
 * 	- FileInputStream �� ¦ Buffered
 *  - ���� ��ȯ ���� ��Ʈ��  : OutputStreamWriter, InputStreamReader
 *  - ���� ��� ���� ��Ʈ�� : BufferedOutputStream(����Ʈ), BufferedWriter(����)
 *  					BufferedInputStream(����Ʈ), BufferedReader(����)
 *  
 *  �⺻Ÿ�� ����� ���� ��Ʈ�� (�⺻Ÿ�� int, long, double �̷���)
 *  DataInputStream, DataOutputStream
 *  
 *  ��� ������Ʈ�� : print�ø���  ����ϴ°�
 *   ** printStream�� print()�޼ҵ�� ����� ������  BufferedReader�� readLine()���� ������ ����.
 *   
 *    ex)FileInputStream fis = new FileInputStream("src/ch24/DBConnectionMgr.java");
 *    	 BufferedReader br = new BufferedReader(new InputStreamReader(fis));
 *    
 *   	 FileOutputStream fos = new FileOutputStream("LineNum.txt");
 *   	 PrintStream ps = new PrintStream(fos);
 *   
 *  ��ü ����� ���� ��Ʈ�� Object + ��ǲ, �ƿ�ǲ��Ʈ��~
 *  
 *  ����� ���� api
 *  System.in �ʵ�
 *  InputStream is = System.in;
 *  Ű����κ��� ���� ���� Ȯ���Ϸ���(����Ʈ�� ����), read()�޼ҵ�� �������.
 *  
 *  InputReader ������Ʈ���� �����ؼ� Reader�� ��ȯ.
 *  
 *  
 *  
 *  
 *  
 * 
 *  
 *  
 * @author KDH
 *
 */

public class JavaSocketMethod {

}