package terminated3;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;
	
	//생성자
	Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	//메소드
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts]=account;
		numberOfAccounts ++;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}	

	
}
