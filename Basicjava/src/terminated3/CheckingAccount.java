package terminated3;

public class CheckingAccount extends BankAccount {
	//필드
	private SavingsAccount protectedBy;
	
	//생성자
	CheckingAccount(int balance){
		super(balance);		
	}
	CheckingAccount(int balance,SavingsAccount protectedBy){
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	//메소드		
	public boolean withdraw(int amount) {
		if (amount>this.balance) {
			protectedBy.balance -= (amount-this.balance);
			this.balance = 0;
			return false;
		}
			this.balance -= amount;
			return true;		
	}
	@Override
	public String getAccounttype() {
		return "당좌예금";
	}
}