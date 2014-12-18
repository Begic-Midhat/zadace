package packtask5;

public class TaskTester {
	public static void main(String[] args) {
		Phone p1 = new Iphone();
		p1.call();

		MobilePhone mp1 = new MobilePhone();
		mp1.call();

		MobilePhone mp2 = new Iphone();
		mp2.call();
		mp2.call(1212121221);
	}
}
