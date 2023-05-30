package collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		// linked list allow duplicate value
		ll.add("Nitesh");
		ll.add("Nitesh");
		ll.add(10);
		// Linked List allow multiple null value
		ll.add(null);
		ll.add(null);
		ll.add('C');
		System.out.println(ll);
	}

}
