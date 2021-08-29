package ch08_1_interface;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		//자동형변환 tv는 SamrtTelevision의 변수인데 RemoteControl로 받음.
		//RemoteControl기능만 사용가능.
		RemoteControl rc = tv;
		rc.turnOn();
		//Searchable기능만 사용가능.
		Searchable sc = tv;
		sc.search("www.google.com");
	}
}
