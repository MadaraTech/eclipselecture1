
class Student{
	String name;
	static String school = "BankuAugstskola";
}

public class StaticExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student = new Student();

//System.out.prinln("name");
System.out.println(Student.school);
	}

}
