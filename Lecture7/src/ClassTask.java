class User {
	
	// fileds
	String name;
	int age;
	boolean man;

	void sayHi() {
		System.out.println("Hi, my name is " + name + " I'm " + age + " old");
	}
}

public class ClassTask {

	public static void main(String[] args) {
		String name = "Wilhelm";
		int age = 19;
		boolean man = true;
		
		String name1 = "Jane";
		int age2 = 22;
		boolean man2 = false;
			
		User wilhelm = new User();
		wilhelm.name = "Wilhelm";
		wilhelm.age = 19;
		wilhelm.man = true;
		wilhelm.sayHi();
		
		User jane = new User();
		jane.name = "Jane";
		jane.age = 22;
		jane.man = true;
		jane.sayHi();

	}

}
