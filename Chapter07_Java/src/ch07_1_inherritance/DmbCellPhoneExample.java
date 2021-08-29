package ch07_1_inherritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DMBCellPhone 객체 생성
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		System.out.println("채널 :" + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요.");
		dmbCellPhone.sendVoice("아~ 예~");
		dmbCellPhone.hangup();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannalDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
/*
 *상속인지 그냥 가져다 쓸지 결정하는것은  has a ... is a 를 따져서 해야함.
 *ㅇㅇ는 ㅁㅁ에 포함된다 가 말이되는지 ㅇㅇ는 ㅁㅁ를 가진다 라고 했을때 말이되는지 생각해본다.
 * 
 */
