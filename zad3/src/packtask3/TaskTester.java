package packtask3;

public class TaskTester {

	public static void main(String[] args) {
		MyDuoClass object1 = MyDuoClass.getInstance();
		object1.setMessage("Hello 1.!");
		System.out.println(object1.getMessage());

		MyDuoClass object2 = MyDuoClass.getInstance();
		object2.setMessage("Hello 2.!");
		System.out.println(object2.getMessage());

		MyDuoClass object3 = MyDuoClass.getInstance();
		object3.setMessage("Hello 3.!");
		System.out.println(object3.getMessage());

		System.out.println(object2.getMessage());
	}
}
