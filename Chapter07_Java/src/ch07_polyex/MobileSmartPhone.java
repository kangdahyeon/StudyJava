//package ch07_polyex;
//
//class MobilePhone {
//	//�ʵ�
//	protected String number;
//	
//	//������
//	public MobilePhone(String number) {
//		this.number = number;	//this �� ������ �ʾƵ� ������ �ϳ�,�����̸��� ������ �򰥸��� �ʰ� this�� ���ִ°��� ����.
//		
//	}
//	//�޼ҵ�
//	public void receive() {
//		System.out.println("Hi form" + this.number);
//	}
//}
//
//public class SmartPhone extends MobilePhone {
//	//�ʵ�
//	private String androidVer;
//	
//	//������
//	public SmartPhone(String num, String ver) {	// ��ȣ �ȿ� ��ӹ�������, �ʱ�ȭ�� ���� �־��ش�.
//		super(num);
//		androidVer = ver;
//	}
//	//�޼ҵ�
//	public void send(String number) {
//		System.out.println("Hello to" + number);
//	}
//	@Override
//	public void receive() {
//		// TODO Auto-generated method stub
//		super.receive();
//		System.out.println("Smart");
//	}
//	public void playApp() {
//		System.out.println("App is running in " + androidVer);
//	}
//}
//public class MobileSmartPhone {
//	public static void main(String[] args) {
//		//����Ʈ�� ��ü ����
//		SmartPhone phone = new SmartPhone("010-1234-1234", "Android7.0");
//		
//		//��ȭ�ɱ�
//		phone.send("010-5678-5678");
//		
//		//��ȭ�ޱ�
//		phone.receive();
//		//���� �����Ͽ� �����ϱ�
//		phone.playApp();
//	}
//}
//
