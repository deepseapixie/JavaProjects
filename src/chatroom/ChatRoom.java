package chatroom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChatRoom {
	static SinglyLinkedList<Representative> availableReps = new SinglyLinkedList<Representative>();
	static SinglyLinkedList<Representative> busyReps = new SinglyLinkedList<Representative>();
	static SinglyLinkedList<Order> currentOrders = new SinglyLinkedList<Order>();
	
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = args[0];
		File input = new File(fileName);
		Scanner sc = new Scanner(input);
		
		availableReps.addLast(new Representative("Alice"));
		availableReps.addLast(new Representative("Bob"));
		availableReps.addLast(new Representative("Carol"));
		availableReps.addLast(new Representative("David"));
		availableReps.addLast(new Representative("Emily"));
		
		while (sc.hasNext()){
			String command = sc.next();
//			System.out.println(command);
			if (command.equals("CustomerOrder")){
				String time = sc.next();
				int hour = Integer.parseInt(time.substring(0, 2));
				int minute = Integer.parseInt(time.substring(2));
				Time time = new Time(hour, minute);
				
				String customerName = sc.next();
				
				int numBooks = Integer.parseInt(sc.next());
				int numElectronics = Integer.parseInt(sc.next());
				
				Customer customer = new Customer(customerName, numBooks, numElectronics);
				
				Representative representative = availableReps.first();
				busyReps.addLast(availableReps.removeFirst());
				
				currentOrders.addLast(new Order(customer, representative, time));
			}
		}
	}
}
