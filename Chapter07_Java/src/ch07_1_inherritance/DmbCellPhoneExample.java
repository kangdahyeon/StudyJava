package ch07_1_inherritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DMBCellPhone ��ü ����
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		System.out.println("ä�� :" + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���.");
		dmbCellPhone.sendVoice("��~ ��~");
		dmbCellPhone.hangup();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannalDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
/*
 *������� �׳� ������ ���� �����ϴ°���  has a ... is a �� ������ �ؾ���.
 *������ ������ ���Եȴ� �� ���̵Ǵ��� ������ ������ ������ ��� ������ ���̵Ǵ��� �����غ���.
 * 
 */
