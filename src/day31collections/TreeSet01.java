package day31collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
 	1)	"TreeSet" is to store unique elements in natural order
 		Natural order is alphabetical order for "String" 
 					  is ascending for "integers"
 	2)	"TreeSet" doesn't accept "null" as element
 	3)	In terms of speed: TreeSet(slow) < LinkedHashSet < HashSet(Fast)
 */

public class TreeSet01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(12);
		ts1.add(3);
		ts1.add(7);
		ts1.add(5);
		ts1.add(2);
		System.out.println(ts1); // [2, 3, 5, 7, 12]
		//ts1.add(null);
		//System.out.println(ts1); // it throws NullPointerException
		
		// Way 1) How to store unique elements in natural order? By adding them into a TreeSet
		// Way 2) TreeSet is too slow, how can you make the code run faster?
		// 		firstly, create a HashSet, and put elements into the HashSet
		// 		secondly, create an empty TreeSet, and convert HashSet to TreeSet
		
		// Way 1:
		// to get system time
		long t1 = System.nanoTime();
		
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("A");
		ts2.add("X");
		ts2.add("P");
		ts2.add("K");
		ts2.add("D");
		System.out.println(ts2); // [A, D, K, P, X]
		long t2 = System.nanoTime();
		
		// Way 2:
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("A");
		hs1.add("X");
		hs1.add("P");
		hs1.add("K");
		hs1.add("D");
		System.out.println(hs1); // [P, A, D, X, K]
		
		
		//we need to create TreeSet now
		//TreeSet<String> ts3 = new TreeSet<>();
		// then convert HashSet to TreeSet
		//ts3.addAll(hs1);
		//System.out.println(ts3); // [A, D, K, P, X]
		
		// or we can send it to the constructor
		TreeSet<String> ts3 = new TreeSet<>(hs1);
		System.out.println(ts3); // [A, D, K, P, X]
		long t3 = System.nanoTime();
		
		System.out.println(t2-t1);
		System.out.println(t3-t2);
		
		
		
		
		
		

	}

}
