package Test;

import java.util.HashMap;

class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(studentNum.equals(studentNum.getClass())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {		
		return studentNum.hashCode();
	}
}

public class StudentExample {
	public static void main(String[] args) {
		
	}
}
