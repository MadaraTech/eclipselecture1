import java.util.Scanner;


public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times I should repeat?:");
		int interation = scanner.nextInt();
		for(int i = interation; i>0; i--){
			System.out.println("Repeat" + i);
		}

	}

}
