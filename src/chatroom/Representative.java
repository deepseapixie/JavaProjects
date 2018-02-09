package chatroom;

import java.util.ArrayList;

public class Representative {
	private String name;
	private Customer customer;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private Boolean bundle;
	
	public Representative(String name) {
		this.name = name;
		this.bundle = true;
	}
	
	private void canBundle(Customer c){
		int currentTotalItems = 0;
		for(Customer customer : customers){
			currentTotalItems += customer.getNumBooks();
			currentTotalItems += customer.getNumElectronics();
		}
		
		int customerItems = c.getNumBooks() + c.getNumElectronics();
		
		if (currentTotalItems + customerItems <= 10){
			this.bundle = true;
		}
		else {
			this.bundle = false;
		}
	}
	
	public void addCustomer(Customer c){
		canBundle(c);
		if (bundle)
			this.customers.add(c);
	}

	public String getCustomer() {
		return this.customer.getName();
	}

	public String getName() {
		return name;
	}
}
