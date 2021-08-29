package ch08_3_example;

class SP204Driver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("SP204Driver");
		System.out.println(doc + "\n");
		
	}
}
class LP870Driver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("LP870Driver");
		System.out.println(doc + "\n");
		
	}
}
public class PrinterTest2 {
	public static void main(String[] args) {
		
		String myDoc = "This is a report";
		Printable prn = null;
		
		prn = new SP204Driver();
		prn.print(myDoc);
		
		
		prn = new LP870Driver();
		prn.print(myDoc);
	}
}
