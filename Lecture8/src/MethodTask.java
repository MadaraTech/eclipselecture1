class Task1 {
	String method1(boolean arg1, double arg2) {
		return " " + arg1 + arg2;
	}
}

public class MethodTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task1 b = new Task1();
		System.out.println(b.method1(true, 5.5));

	}

}
