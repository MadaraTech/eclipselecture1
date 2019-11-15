
public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++){
			System.out.println("Iteration " + i);
			if(i == 5){
				System.out.println("Reached break statement on iteratiom =" + i);
				break;
			}
			System.out.println("Iteration " + i);
		}
		
		System.out.println("Main app continue work");

	}

}
