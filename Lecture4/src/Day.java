import java.util.Scanner;

public class Day {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert day index:");
		int dayIndex = scanner.nextInt();

		switch (dayIndex) {
		case 5:
			System.out.println("Friday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 1:
			System.out.println("Monaday");
			break;
		default:

			System.out.println("Unimplemented part, for dayIndex:" + dayIndex);

		}
	}
}