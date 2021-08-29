package ch08_3_example;

// �÷������� ����.
class SP9600Driver implements ColorPrintable {

	@Override
	public void printCMYK(String doc) {
		System.out.println("Samsung Color Printing");
		System.out.println(doc + "\n");
	}

	@Override
	public void print(String doc) {
		System.out.println("Samsung Printing");
		System.out.println(doc + "\n");
	}
}
public class PrinterTest3 {
	public static void main(String[] args) {
		
	String myDoc = "This is report";
	ColorPrintable prn = new SP9600Driver();
	
	prn.print(myDoc);
	prn.printCMYK(myDoc);
	}
}
