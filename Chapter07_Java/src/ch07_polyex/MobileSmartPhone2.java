package ch07_polyex;

class MobilePhone {
	//�ʵ�
	protected String number;
	
	//������
	public MobilePhone(String number) {
		this.number = number;	//this �� ������ �ʾƵ� ������ �ϳ�,�����̸��� ������ �򰥸��� �ʰ� this�� ���ִ°��� ����.
		
	}
	//�޼ҵ�
	public void receive() {
		System.out.println("Hi form" + this.number);
	}
}

	class SmartPhone extends MobilePhone {
	//�ʵ�
	private String androidVer;
	
	//������
	public SmartPhone(String num, String ver) {	// ��ȣ �ȿ� ��ӹ�������, �ʱ�ȭ�� ���� �־��ش�.
		super(num);
		androidVer = ver;
	}
	//�޼ҵ�
	public void send(String number) {
		System.out.println("Hello to" + number);
	}
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		super.receive();
		System.out.println("Smart");
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
public class MobileSmartPhone2 {
	public static void main(String[] args) {
		//����Ʈ�� ��ü ����
		SmartPhone phone1 = new SmartPhone("010-1234-1234", "Android7.0");
		
		MobilePhone phone2 = new SmartPhone("010-0000-1234", "Android7.0");
		//�θ� Ŭ������ ��������(phone2)�� �ڽ� Ŭ����(SmartPhone)�� �ν��Ͻ��� �����Ҽ��ִ�.
		//MobilePhone�� ���������� SmartPhone�� �ν��Ͻ��� ���� ����.(���� ������)
		//�̷��� ����ȯ�� �ϸ� phone2������ MobilePhone�� �޼ҵ常 ��밡���ϴ�.
		SmartPhone phone3 =(SmartPhone) new MobilePhone("1234");
		//�ڽ�Ŭ������ �θ�Ŭ������ �ν��Ͻ��� �����Ϸ��� �ϸ�, ������ ����ȯ���� ������ ������ ����.
		

		//��ȭ�ɱ�
		phone1.send("010-5678-5678");
		
		//��ȭ�ޱ�
		phone1.receive();
		phone2.receive();
		//���� �����Ͽ� �����ϱ�
		phone1.playApp();
	}
}

