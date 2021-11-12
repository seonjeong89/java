package terminated3;

public class Bank {
	//필드
	private Customer[] customers;
	private int numberOfCustomers;
	
	//생성자
	Bank(){
		customers = new Customer[10];
	}
	
	//메소드
	public void addCustomer(Customer customer) {
			customers[numberOfCustomers]=customer;
			numberOfCustomers ++;	
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return customers;
	}
	
	Customer getCustomer(int index) {
		return customers[index];
	}	
}
