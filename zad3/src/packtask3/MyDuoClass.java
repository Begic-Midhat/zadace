package packtask3;

public class MyDuoClass {
	private static MyDuoClass instances[] = { null, null };
	private String message;

	private MyDuoClass() {
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static MyDuoClass getInstance() {
		if (instances[0] == null) {
			instances[0] = new MyDuoClass();
			return instances[0];
		} else if (instances[1] == null) {
			instances[1] = new MyDuoClass();
			return instances[1];
		} else
			return instances[1];
	}
}
