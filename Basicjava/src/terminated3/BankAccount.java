package terminated3;

public abstract class BankAccount {
	
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
	 * @param amount 출금할 금액
	 * @return 반환 값 
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
	 * @param amount 이체할 금액
	 * @param otherAccount 다른 사람 계좌
	 * @return
	 */
	public boolean transfer(int amount,BankAccount otherAccount) {
			if(withdraw(amount)) {
				otherAccount.deposit(amount);
				return true;
			}
			return false;
		}	
	
	@Override
	public String toString() {
		return String.format("잔액: %,d",getBalance());
	}

	public abstract String getAccounttype();
}