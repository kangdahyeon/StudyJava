package summary;
/**
 * [입출력 스트림]
 *  - 바이트 기반 스트림 
 *  	InputStream, OutputStream : 최상위 스트림이며, 하위 스트림엔 클래스 접미사로 붙음.
 *  
 *  - 문자 기반 스트림
 *  	Reader, Writer : 최상위 스트림이며, 하위 스트림엔 클래스 접미사로 붙음.
 *  
 * [보조스트림]
 * 	다른 스트림과 연결되어 기능을 제공해주는 스트림.->보조스트림은 인풋 아웃풋 뒤에 이름이 붙는듯..?
 * 	- FileInputStream 의 짝 Buffered
 *  - 문자 변환 보조 스트림  : OutputStreamWriter, InputStreamReader
 *  - 성능 향상 보조 스트림 : BufferedOutputStream(바이트), BufferedWriter(문자)
 *  					BufferedInputStream(바이트), BufferedReader(문자)
 *  
 *  기본타입 입출력 보조 스트림 (기본타입 int, long, double 이런거)
 *  DataInputStream, DataOutputStream
 *  
 *  출력 보조스트림 : print시리즈  출력하는거
 *   ** printStream의 print()메소드로 출력한 내용은  BufferedReader의 readLine()으로 읽으면 편리.
 *   
 *    ex)FileInputStream fis = new FileInputStream("src/ch24/DBConnectionMgr.java");
 *    	 BufferedReader br = new BufferedReader(new InputStreamReader(fis));
 *    
 *   	 FileOutputStream fos = new FileOutputStream("LineNum.txt");
 *   	 PrintStream ps = new PrintStream(fos);
 *   
 *  객체 입출력 보조 스트림 Object + 인풋, 아웃풋스트림~
 *  
 *  입출력 관련 api
 *  System.in 필드
 *  InputStream is = System.in;
 *  키보드로부터 들어온 값을 확인하려면(바이트로 들어옴), read()메소드로 읽으면됌.
 *  
 *  InputReader 보조스트림을 연결해서 Reader로 변환.
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
