package ch08_2_polymorphism;

public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA()����");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB()����");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC()����");
	}
}
