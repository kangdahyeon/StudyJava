package ch07_polyex2;
/**
 * ��Ӿ��� ������� ��ӱ����� �ٲ㺸��.
 * 
 * �������� ���� ã�ƺ���,
 * @author KDH
 *
 */
class Friends {
	//�ʵ�
	private String name;
	private String phone;
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	//������
	public Friends(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	//�޼ҵ�
	public void showInfo() {
		System.out.print("�̸� : " + name);
		System.out.print("��ȭ : " + phone);
	}
}

class UnivFriend extends Friends {
	
	private String major;

	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + major);

	}
}

class CompFriend extends Friends {
	//�ʵ�
	
	private String department;
	
	
	//������
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	//�޼ҵ�
	public void showInfo() {
		super.showInfo();
		System.out.println("�μ� : " + department);
	}	
}

public class MyFriends {
	public static void main(String[] args) {
		//����ģ���� ������ ���� �迭�� ����
		Friends[] frns = new Friends[6];
		int cnt = 0;
	
		
		//���� ģ�� �߰�
		frns[cnt++] = new UnivFriend("1","Computer","010-");
		frns[cnt++] = new UnivFriend("2","Computer","010-");
		frns[cnt++] = new UnivFriend("3","Computer","010-");
	
		//���� ģ�� �߰�
		frns[cnt++] = new CompFriend("4","R&D","010-");
		frns[cnt++] = new CompFriend("5","R&D","010-");
		frns[cnt++] = new CompFriend("6","R&D","010-");
		
		//����ģ����� �ϰ����
		for(int i = 0; i < frns.length; i++) {
			frns[i].showInfo();
			if(frns[i].getName().equals(2)) {
				System.out.printf("ģ����� %d��° ���� ã�ҽ��ϴ�./n", i+1 );
			}
		}
	}
}