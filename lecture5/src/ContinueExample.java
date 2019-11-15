public class ContinueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Main app starts work");
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				System.out.println("Still Checking by break");
				break;
			}
			if (i >= 6) {
				System.out.println("Still Checking by continue");
				continue;
			}
			System.out.println("Iteration " + i);
		}
		System.out.println("Main app ends work");
	}
}