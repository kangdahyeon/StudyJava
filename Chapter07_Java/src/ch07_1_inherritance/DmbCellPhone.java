package ch07_1_inherritance;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model,String color,int channal) {
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("자식생성자");
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB방송 수신을 시작합니다.");
	}
	 void changeChannalDmb(int channel) { 
		 this.channel = channel;
		 System.out.println("채널 " + channel + "번으로 바꿉니다.");
	 }
	 void turnOffDmb() {
		 System.out.println("DMB방송 수신을 멈춥니다.");
	 }
}
