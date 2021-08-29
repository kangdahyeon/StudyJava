package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		

	String myDoc = "This is a report";
	Printable prn = null;
	
	//삼성프린터 출력 검사
	prn = new SprinterDirver();
	prn.print(myDoc);
	
		
	

	//LG프린터 출력 검사
	prn = new LprinterDirver();
	prn.print(myDoc);
	}
}


// 삼성 프린터 드라이버
class SprinterDirver implements Printable {
	
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer--------");
		System.out.println(doc);
		
	}
}
// LG프린터 드라이버

class LprinterDirver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer------------");
		System.out.println(doc);
	}
	
}