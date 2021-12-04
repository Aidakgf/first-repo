package day30collections;

import java.util.LinkedList;
import java.util.List;

		/*
		 	ArrayList:	i) slow in insertion/deletion since some indexes are updated
		 				ii)	fast is search since we can use index of elements to reach them 
		 	
		 	LinkedList:	i)	fast in insertion/deletion element since it doesn't use index
		 				ii)	slow in search since we should check element from head to tail
		 				
		 */


public class LinkedList01 {

	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Can");
		ll1.add("Mete");
		
		// How to print a linked list
		System.out.println(ll1); // [Ali, Veli, Can, Mete]
		
		
		// How to get the first element from a linked list
		String firstElement1 = ll1.getFirst(); // (Deque) - returns first element
		System.out.println(firstElement1); // Ali
		System.out.println(ll1); // [Ali, Veli, Can, Mete]
		
		// there are some other methods to get 1st element
		String firstElement2 = ll1.element(); // (Queue) - returns first element
		System.out.println(firstElement2); // Ali
		System.out.println(ll1); // [Ali, Veli, Can, Mete]
		
		String firstElement3 = ll1.peek(); // (Queue) - returns first element
		System.out.println(firstElement3); // Ali
		System.out.println(ll1); // [Ali, Veli, Can, Mete]
		
		String firstElement4 = ll1.poll(); // (Queue) - returns first element and removes it from the linked list
		System.out.println(firstElement4); // Ali
		System.out.println(ll1); // [Veli, Can, Mete]
		
		
		// How to get first element from an empty linked list
		LinkedList<String> ll2 = new LinkedList<>(); // empty linked list
//		String firstElementFromEmptyLinkedList1 = ll2.getFirst(); 
//		System.out.println(firstElementFromEmptyLinkedList1); // it throws NoSuchElementException
		
//		String firstElementFromEmptyLinkedList2 = ll2.element();
//		System.out.println(firstElementFromEmptyLinkedList2); // NoSuchElementException
		
		String firstElementFromEmptyLinkedList3 = ll2.peek();
		System.out.println(firstElementFromEmptyLinkedList3); // null
		
		String firstElementFromEmptyLinkedList4 = ll2.poll();
		System.out.println(firstElementFromEmptyLinkedList4); // null
		
		
		// How to remove an element from a linked list
		LinkedList<Integer> ll3 = new LinkedList<>();
		ll3.add(0, 5);
		ll3.add(1, 9);
		ll3.add(2, 3);
		ll3.add(3, 7);
		System.out.println(ll3); // [5, 9, 3, 7]
		
		int remove1 = ll3.remove(); // remove() removes the first element
		System.out.println(remove1); // 5
		System.out.println(ll3); // [9, 3, 7]
		
		int remove2 = ll3.remove(2);
		System.out.println(remove2); // 7
		System.out.println(ll3); // [9, 3]
		
		ll3.add(9);
		ll3.add(5);
		ll3.add(3);
		System.out.println(ll3); // [9, 3, 9, 5, 3]
		
		ll3.removeFirstOccurrence(3);
		System.out.println(ll3); // [9, 9, 5, 3]
		
		ll3.removeLastOccurrence(9);
		System.out.println(ll3); // [9, 5, 3]
		
		
		// How to remove multiple elements from a linked list
		ll3.add(4);
		ll3.add(5);
		ll3.add(9);
		ll3.add(7);
		System.out.println(ll3); // [9, 5, 3, 4, 5, 9, 7]
		
		LinkedList<Integer> ll4 = new LinkedList<>();
		ll4.add(5);
		ll4.add(9);
		ll4.add(7);
		System.out.println(ll4); // [5, 9, 7]
		
		ll3.removeAll(ll4);
		System.out.println(ll3); // [3,4]	
		
		ll4.removeAll(ll4);
		System.out.println(ll4); // []
		
		
		// How to insert multiple elements into a linked list
		System.out.println(ll3); // [3, 4]
		ll3.addAll(ll3);
		System.out.println(ll3); // [3, 4, 3, 4]
		
		
		// How to update a specific node
		ll3.set(1, 10);
		System.out.println(ll3); // [3, 10, 3, 4]
		
		
		// How to get a sub-list from a linked list
		List<Integer> sublist01 = ll3.subList(1, 3);
		System.out.println(sublist01); // [10, 3]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
				
		
		 

	}

}
