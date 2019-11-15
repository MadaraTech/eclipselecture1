class User {
	// fileds
	String name;
	int age;
	boolean man;

	void sayHi() {
		System.out.println("Hi, my name is " + name + " I'm " + age + " old");
	}
}

public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Peter";
		int age = 21;
		boolean man = false;
		
		String name1 = "Anna";
		int age2 = 22;
		boolean man2 = true;
		
		User peter = new User();
		peter.name = "Peter";
		peter.age = 21;
		peter.man = true;
		peter.sayHi();
		
		User anna = new User();
		anna.name = "Anna";
		anna.age = 20;
		anna.man = false;
		anna.sayHi();
		
		User john = new User();
		john.name = "John";
		john.age = 20;
		john.man = true;
		john.sayHi();
	}
}
