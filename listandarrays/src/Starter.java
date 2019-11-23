import java.util.ArrayList;
import java.util.Arrays;

public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrays = new int[3];

		System.out.println("Array length is: " + arrays.length);

		arrays[0] = 1;
		// arrays[4] = 10;

		System.out.println(Arrays.toString(arrays));

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Volvo");
		arrayList.add("Lada");
		arrayList.add("Tesla");
		arrayList.add("Skoda");
		arrayList.add("BMW");

		String gotoArray;
//		arrayList.set(1, gotoArray);

		System.out.println("ArrayList size is: " + arrayList.size());

		arrayList.remove(2);

		System.out.println("ArrayList size is: " + arrayList.size());
//		String elementZero = arrayList.get(0);
//		System.out.println("Element zero is: " + elementZero);
//		ArrayList<Integer> arrayTest = new ArrayList<>();
//	}
////	for (int i=0; i < arrayList.size(); i++);
//	private static void get(int i) {
//	
//
	
//
}
}
