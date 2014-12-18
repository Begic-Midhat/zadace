package packtask5;

public class Iphone extends MobilePhone implements Phone {
	public void call() {
		System.out.println("Calling from iPhone");
	}

	public void call(int number) {
		System.out.println("Calling number " + number + " from iPhone");
	}
}
