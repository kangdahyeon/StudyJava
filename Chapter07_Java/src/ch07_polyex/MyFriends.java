package ch07_polyex;
/**
 * ��Ӿ��� ������� ��ӱ����� �ٲ㺸��.
 * @author KDH
 *
 */

class UnivFriend {
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + major);
		System.out.println("��ȭ : " + phone);
	}
	
}

class CompFriend {
	//�ʵ�
	private String name;
	private String department;
	private String phone;
	
	//������
	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
		
		
	}
	//�޼ҵ�
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�μ� : " + department);
		System.out.println("��ȭ : " + phone);
	}	
}

public class MyFriends {
	public static void main(String[] args) {
		//����ģ���� ������ ���� �迭�� ����
		UnivFriend[] ufrns = new UnivFriend[3];
		int ucnt = 0;
		
		//���嵿���� ������ ���� �迭�� ����
		CompFriend[] cfrns = new CompFriend[3];
		int ccnt = 0;
		
		//���� ģ�� �߰�
		ufrns[ucnt++] = new UnivFriend("1","Computer","010-");
		ufrns[ucnt++] = new UnivFriend("2","Computer","010-");
		ufrns[ucnt++] = new UnivFriend("3","Computer","010-");
	
		//���� ģ�� �߰�
		cfrns[ccnt++] = new CompFriend("4","R&D","010-");
		cfrns[ccnt++] = new CompFriend("5","R&D","010-");
		cfrns[ccnt++] = new CompFriend("6","R&D","010-");
		
		//����ģ����� �ϰ����
		for(int i = 0; i < ufrns.length; i++) {
			ufrns[i].showInfo();
		}
		//����ģ����� �ϰ����
				for(int i = 0; i < cfrns.length; i++) {
					cfrns[i].showInfo();
		}
	}
}