package ch07_1_inherritance;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿","123456-1234567",1);
		System.out.println("name : " + student.getName());
		System.out.println("ssn : " + student.getSsn());
	}
}
