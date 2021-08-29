package ch08_2_polymorphism;

public class Train implements Vehicle {

	@Override
	public void run() {
		System.out.println("기차가 달린다.");
		
	}
}
