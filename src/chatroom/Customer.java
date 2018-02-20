package chatroom;

public class Customer {
	private String name;
	private int books;
	private int electronics;
	
	public Customer(String name, int books, int electronics){
		this.name = name;
		this.books = books;
		this.electronics = electronics;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNumBooks(){
		return books;
	}
	
	public int getNumElectronics(){
		return electronics;
	}
}
