package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		

	String myDoc = "This is a report";
	Printable prn = null;
	
	//�Ｚ������ ��� �˻�
	prn = new SprinterDirver();
	prn.print(myDoc);
	
		
	

	//LG������ ��� �˻�
	prn = new LprinterDirver();
	prn.print(myDoc);
	}
}


// �Ｚ ������ ����̹�
class SprinterDirver implements Printable {
	
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer--------");
		System.out.println(doc);
		
	}
}
// LG������ ����̹�

class LprinterDirver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer------------");
		System.out.println(doc);
	}
	
}