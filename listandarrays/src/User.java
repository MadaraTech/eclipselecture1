
public class User {
	private String name;
	private int bankAcc;
	
	public User(String n, int banAcc){
		this.name = n;
		this.bankAcc = bankAcc;
		
	}
	public User(){
	
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBankAcc() {
		return bankAcc;
	}
	public void setBankAcc(int bankAcc) {
		this.bankAcc = bankAcc;
	}
	
}