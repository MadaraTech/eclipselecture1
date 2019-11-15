import java.util.Scanner;


public class ExampleTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		double input = scanner.nextDouble();
		System.out.println(input);
		if(input<8){
			System.out.println(input + " is negative");
		}else{
			System.out.println(input + " is positive");
		}
		
	}

}
