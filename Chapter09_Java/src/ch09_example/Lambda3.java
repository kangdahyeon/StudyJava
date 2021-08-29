//package ch09_example;
//
//interface Readable {
//	void read(String s);
//}
//
////class Reader implements Readable {
////	@Override
////	public void read(String s) {
////		System.out.println("\"" + s + "\"" + "을 (를) 읽는다.");
////	}
////}
//
//public class Lambda3 {
//	public static void main(String[] args) {
//		
//		Readable r1 = 
//		(String s) -> {System.out.println("\"" + s + "\"" + "을 (를) 읽는다.");};
//		
////		Readable r1 = new Readable() {
////		@Override
////		public void read(String s) {
////			System.out.println("\"" + s + "\"" + "을 (를) 읽는다."); 를 -> 로 해결함..뭐야
//		
//		
//				
//		r1.read("What is Lambda?");
//		
//	}
//}