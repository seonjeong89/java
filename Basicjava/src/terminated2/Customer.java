package terminated2;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
	private BankAccount Account;
	
	//생성자
	Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//메소드
	public BankAccount getAccount() {
		return Account;
	}

	public void setAccount(BankAccount account) {
		Account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return String.format("이름 %s %s, 잔고: %,d원", firstName,lastName,Account.getBalance());
	}
//	public String toString() {
//		return "이름: " + firstName + " " + lastName + ", 잔고: " + Account.getBalance() + "원";
//	}
	
}
