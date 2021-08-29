package ch09_example;

interface Printable {
	void print();
}

class Papers {
	public String contents;
	
	public Papers(String s) {
		contents = s;
	}
	public Printable getPrinter() {
		return new Printable() {

			@Override
			public void print() {
				System.out.println(Papers.this.contents);
				
			}
		};
	}
}

public class UseAnonymousInner {
	public static void main(String[] args) {
		Papers papers = new Papers("My");
		Printable prn = papers.getPrinter();
		prn.print();
	}

}
