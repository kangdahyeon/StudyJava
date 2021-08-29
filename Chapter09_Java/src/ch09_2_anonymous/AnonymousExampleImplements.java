package ch09_2_anonymous;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

class AnonymousImpl {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}

public class AnonymousExampleImplements{
	public static void main(String[] args) {
		AnonymousImpl anony = new AnonymousImpl();
		
	anony.field.turnOn();
	
	anony.method1();
	
	anony.method2(
		new RemoteControl() {
			
		@Override
		public void turnOn() {
			System.out.println("SmartTV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("SmartTV�� ���ϴ�.");
		}
	});
	}
}
