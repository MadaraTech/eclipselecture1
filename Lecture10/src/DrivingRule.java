public class DrivingRule {
	private final String name;// initialize in field or in constructor
	private String description;

	private static String country = "Latvia";

	private static final int MAX_SPEED_IN_CITY = 50;
	private static final int MAX_SPEED_OUTSIDE_CITY = 90;

	static int amount = 0;

	public DrivingRule(String name) {
		this.name = name;
		amount++;
		System.out.println("Driving rule " + name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrivingRule rule1 = new DrivingRule("Speed limit in city");
		DrivingRule rule2 = new DrivingRule("Speed outside city");

		System.out.println("Total amount of driving rules "
				+ DrivingRule.amount);
	}

}