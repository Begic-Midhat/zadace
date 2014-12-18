package packtask5;

public class MobilePhone implements Phone {
	public void call() {
		System.out.println("Calling from mobile phone");
	}

	public void call(int number) {
		System.out.println("Calling number " + number + " from mobile phone");
	}
}
