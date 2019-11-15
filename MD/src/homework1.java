import java.util.Scanner;
public class homework1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String msg;
	 	System.out.print("Enter your number = ");
	 	int i,j,n,k=1;
	 	 n = scanner.nextInt();
	   		for(i=1;i<=4;i++){
			for(j=1;j<=i;j++)
		   	System.out.print(k++);
		   	System.out.println("");
				}
			System.out.print("\n");
		}
	}