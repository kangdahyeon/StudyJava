package ch09_example;

interface Readable {
	void read(String s);
}

//class Reader implements Readable {
//	@Override
//	public void read(String s) {
//		System.out.println("\"" + s + "\"" + "�� (��) �д´�.");
//	}
//}

public class Lambda4 {
	public static void main(String[] args) {
		
		Readable r1 = 
		(s) -> {System.out.println("\"" + s + "\"" + "�� (��) �д´�.");};
		
//		Readable r1 = new Readable() {
//		@Override
//		public void read(String s) {
//			System.out.println("\"" + s + "\"" + "�� (��) �д´�."); �� -> �� �ذ��� + String ���� ������ 
		
		
				
		r1.read("What is Lambda?");
		
	}
}