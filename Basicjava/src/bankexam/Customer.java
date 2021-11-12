package bankexam;

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

	public String toString() {
//		return "이름: " + firstName + " " + lastName + ", 계좌의 갯수: " + numberOfAccounts ;
		return String.format("이름: %s %s, 계좌의 갯수: %d", firstName, lastName, getNumberOfAccounts());
	}
}
