public class StaticMethodTask {
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sumArrayValues(int[] myArray) {
		int sum = 0;
		for (int arg : myArray) {
			sum = sum + arg;
		}
		return sum;
	}

	public static void printOut(int[] myArray) {
	}

	public static void main(String[] args) {
		int sum = sum(11, 2, 5);
		System.out.println(sum);

		int[] data = new int[4];
		sumArrayValues(data);
		printOut(data);
	}

}
