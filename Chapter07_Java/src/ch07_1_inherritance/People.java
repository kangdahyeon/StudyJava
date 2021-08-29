package ch07_1_inherritance;

public class People {
	//필드
	private String name;
	private String ssn;
	
	//생성자
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
