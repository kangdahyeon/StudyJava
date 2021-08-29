package ch07_1_inherritance;

public class Student extends People {
	private int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//부모클래스꺼 
		this.studentNo = studentNo;
	}
}
