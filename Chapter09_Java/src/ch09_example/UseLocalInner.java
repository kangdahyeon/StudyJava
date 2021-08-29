//package ch09_example;
//
//interface Printable {
//	void print();
//}
//
//class Papers {
//	public String contents;
//	
//	public Papers(String s) {
//		contents = s;
//	}
//	public Printable getPrinter() {
//		class Printer implements Printable {
//			@Override
//			public void print() {
//				System.out.println(Papers.this.contents);
//			}
//		}
//		return new Printer(); // Printer prn = new Printer -> return prn 으로 쓴거나 마찬가지.
//	}
//}
//public class UseLocalInner {
//	public static void main(String[] args) {
//		Papers papers = new Papers("My doc");
//		Printable prn = papers.getPrinter();
//		prn.print();
//	}
//}
