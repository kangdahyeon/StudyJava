package ch08_1_interface;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		//�ڵ�����ȯ tv�� SamrtTelevision�� �����ε� RemoteControl�� ����.
		//RemoteControl��ɸ� ��밡��.
		RemoteControl rc = tv;
		rc.turnOn();
		//Searchable��ɸ� ��밡��.
		Searchable sc = tv;
		sc.search("www.google.com");
	}
}
