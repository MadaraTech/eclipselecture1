public class ArrayTask3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values = new int[10];
		for (int i = 0; i <= 9; i++) {
			values[i] = 9 - i;
			System.out.println(values[i]);
		} // wrong
		/*
		 * for(int i=9; i>=0;i--){ values[i] = i; //
		 * System.out.println(values[i]); } for(int i=0; i<=9;i++){
		 * System.out.println(values[i]); }
		 */
	}
}