package ch07_1_inherritance;

public class Student extends People {
	private int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//�θ�Ŭ������ 
		this.studentNo = studentNo;
	}
}
