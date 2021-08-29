package ch11_1;

class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		
		return company + ", " + os;
	}
}



public class SmartPhoneExample {
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		
		System.out.println(myPhone);	
	}
}
