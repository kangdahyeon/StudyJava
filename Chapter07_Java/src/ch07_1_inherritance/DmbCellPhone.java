package ch07_1_inherritance;

public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model,String color,int channal) {
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("�ڽĻ�����");
	}
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB��� ������ �����մϴ�.");
	}
	 void changeChannalDmb(int channel) { 
		 this.channel = channel;
		 System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	 }
	 void turnOffDmb() {
		 System.out.println("DMB��� ������ ����ϴ�.");
	 }
}
