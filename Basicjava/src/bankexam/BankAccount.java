package bankexam;

public class BankAccount {
	//필드
	protected int balance;
	
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//메소드
	public int getBalance() {
		return balance;
	}
	
	/**
	 * 
	 * @param amount : 입금할 금액
	 */
	public void deposit(int amount) {
		this.balance = balance + amount;
	}
	
	/**
	 * 
	 * @param amount
	 * @return
	 */
	public boolean withdraw(int amount) {
		if (amount>this.balance) {
			return false;	
		} else {
			this.balance -= amount;
			return true;
		}		
	}
	/**
	 * 		
	 * @param amount
	 * @param otherAccount
	 * @return
	 */
	public boolean transfer(int amount,BankAccount otherAccount) {
//		if (amount>this.balance) {
//			return false;	
//		} else {
//			this.balance = this.balance - amount;
//			otherAccount.balance += amount;
//			return true;
			if(withdraw(amount)) {
				otherAccount.deposit(amount);
				return true;
			}
			return false;
		}	

	@Override
	public String toString() {
		return  String.format("잔액: %,d",balance);
	}
}
