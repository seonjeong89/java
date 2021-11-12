package terminated2;

public class BankAccount {
	//필드
	private int balance;
	
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//메소드
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (amount>this.balance) {
			return false;	
		} else {
			this.balance -= amount;
			return true;
		}		
	}
			
	public boolean transfer(int amount,BankAccount otherAccount) {
//		if (amount>this.balance) {
//			return false;	
//		} else {
//			this.balance = this.balance - amount;
//			otherAccount.balance += amount;
//			return true;
//		}	
		if(withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}		
}

