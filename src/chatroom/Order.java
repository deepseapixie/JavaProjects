package chatroom;

public class Order {
	private Customer customer;
	private Representative representative;
	private Time startTime;
	
	public Order(Customer c, Representative r, Time t){
		this.customer = c;
		this.representative = r;
		this.startTime = t;
	}
	
	public String getCustomer(){
		return this.customer.getName();
	}
	
	public String getRepresentative(){
		return this.representative.getName();
	}
	
	public String getTime(){
		return this.startTime.toString();
	}
}
