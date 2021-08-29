package ch08_3_example;
interface NewPrintable {
	
	void print(String doc);
	default void printCMYK(String doc) {
	}
}
class OldDriver implements NewPrintable {

	@Override
	public void print(String doc) {
		System.out.println("Samsung Printing");
		System.out.println(doc + "\n");
		
	}
}
class NewDirver implements NewPrintable {

	@Override
	public void print(String doc) {
		System.out.println("Samsung Printing");
		System.out.println(doc + "\n");
		
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("Samsung Color Printing");
		System.out.println(doc + "\n");
	}
}

public class PrinterTest4 {
	public static void main(String[] args) {
		String myDoc = "This is report";
		NewDirver prn = new NewDirver();
		
		prn.print(myDoc);
		prn.printCMYK(myDoc);
		
	}
}
