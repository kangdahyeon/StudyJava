package ch08_1_interface;

public interface RemoteControl {
	//���
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}
