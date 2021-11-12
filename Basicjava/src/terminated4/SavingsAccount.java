package terminated4;

public class SavingsAccount extends BankAccount {
	//필드
	private double interestRate;

	//생성자
	public SavingsAccount(int balance,double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	//메소드
	public void updateBalance(int period) {
		this.balance += balance*interestRate*period;
	}

	@Override
	public String getAccounttype() {
		return "저축예금";
	}
}
