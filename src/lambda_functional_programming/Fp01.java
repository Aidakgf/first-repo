package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

	/*
	  1) Lambda is Functional Programming, we started to use Lambda in Java 8.
	  2) Functional Programming focuses on "What to do?" but Structured Programming spends time on "How to do?" 
	  3) Functional Programming can be used just with Collections and Arrays. 
	  4) We cannot use Functional Programming in Maps directly but if you convert Maps to Sets by using "entrySet()" method then you
	  	 can use Functional Programming
	 */

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(8);
		l.add(9);
		l.add(131);
		l.add(10);
		l.add(9);
		l.add(10);
		l.add(2);
		l.add(8);
		l.add(15);

		printElementsStructured(l);
		System.out.println();
		printElementsFunctional(l);
		System.out.println();
		printEvenElementsStructured(l);
		System.out.println();
		printEvenElementsFunctional(l);
		System.out.println();
		printSquareOfOddElements(l);
		System.out.println();
		printCubeOfDistinctElements(l);
		System.out.println();
		sumOfSquaresOfDistinctElements(l);
		System.out.println();
		productOfCubesOfDistinctEvenElements(l);
		System.out.println();
		getMaxElement01(l);
		System.out.println();
		getMaxElement02(l);
		System.out.println();
		
		getMinElement01(l);
		System.out.println();
		getMinElement02(l);
		System.out.println();
		
		getMinGreaterThanSeven01(l);
		System.out.println();
		getMinGreaterThanSeven02(l);
		System.out.println();
		getMinGreaterThanSeven03(l);
		System.out.println();
		
		getHalfOfDistinctElementsInReversedOrder(l);
		System.out.println();

	}

	// 1) Create a method to print the list elements on the console in the same line with a space
	// between two consecutive elements.(Structured)

	public static void printElementsStructured(List<Integer> list) {
		for (Integer w : list) {
			System.out.print(w + " "); // 12 9 131 14 9 10 4 12 15
		}
	}

	// 1) Create a method to print the list elements on the console in the same line with a space
	// between two consecutive elements.(Functional)
	public static void printElementsFunctional(List<Integer> list) {
		list.stream().forEach(t -> System.out.print(t + " ")); // 12 9 131 14 9 10 4 12 15
		// by using stream(). we convert list to stream to have more methods to use
		// forEach() - do smth for each element in the stream.
	
	}

	// 2) Create a method to print the even list elements on the console in the same line with a space
	// between two consecutive elements.(Structured)
	public static void printEvenElementsStructured(List<Integer> list) {
		for (Integer w : list) {
			if (w % 2 == 0) {
				System.out.print(w + " "); // 12 14 10 4 12
			}
		}
	}

	// 2) Create a method to print the even list elements on the console in the same line with a space
	// between two consecutive elements.(Functional)
	public static void printEvenElementsFunctional(List<Integer> list) {
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); // 12 14 10 4 12
	}
	
	// 3) Create a method to print the square of odd list elements on the console in the same line with a 
	// space between two consecutive elements. (Functional)
	public static void printSquareOfOddElements(List<Integer> list) {
		list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t + " ")); // 81 17161 81 225 
	}
	
	// 4) Create a method to print the cube of distinct (displaying multiple elements once) odd list elements on the console in the same line 
	// with a space between two consecutive elements.
	public static void printCubeOfDistinctElements(List<Integer> list) {
		list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t + " ")); // 729 2248091 3375
	}
	// (t->t*t*t) = Lambda expression, where t is variable, after the arrow is the logic of the expression
	
	// 5) Create a method to calculate the sum of the squares of distinct even elements
	public static void sumOfSquaresOfDistinctElements(List<Integer> list) {
		Integer sum = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);
		// (t, u)->t+u) lambda expression
		// reduce(0, (t, u)->t+u) ==== 0 is the same as int sum =0 in structural programming
		System.out.println(sum); // 168
	}
	
	// 6) Create a method to calculate the product of the cubes of distinct even elements
	public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
		Integer product = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t, u)->t*u);
		System.out.println(product); // 4096000
	}
	
	//7)Create a method to find the maximum value from the list elements
	// 1.Way:
	public static void getMaxElement01(List<Integer> list) {
		Integer maxElement = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t>u ? t : u);
		System.out.println(maxElement); // 131
	}
	
	// 2.Way
	public static void getMaxElement02(List<Integer> list) {
		Integer maxElement = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
		System.out.println(maxElement); // 131
	}
	
	
	// HOMEWORK
	// 8) Create a method to find the minimum value from the list elements (in 2 ways) - HOMEWORK
	
	// 1.Way:
	public static void getMinElement01(List<Integer> list) {
		Integer minElement = list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u) -> t<u ? t : u);
		System.out.println(minElement); // 2
	}
	
	// 2.Way:
	public static void getMinElement02(List<Integer> list) {
		Integer minElement = list.
								stream().
								distinct().
								sorted(Comparator.reverseOrder()).
								reduce(Integer.MAX_VALUE, (t,u) -> u);
		System.out.println(minElement); // 2
	} 
	
	
	//9)Create a method to find the minimum value which is greater than 7 and even from the list
	// 1.Way:
	public static void getMinGreaterThanSeven01(List<Integer> list) {
		Integer minGreaterThanSeven = 	list.
											stream().
											distinct().
											filter(t->t>7).
											filter(t->t%2==0).
											reduce(Integer.MAX_VALUE, (t,u)-> t>u ? u : t);
		
		System.out.println(minGreaterThanSeven); // 8
	}
	
	// SonarQube - articles, where experienced developers put some standards. For example, you shouldn't
	// type long code in one line, etc.
	
	// 2.Way:
		public static void getMinGreaterThanSeven02(List<Integer> list) {
			Integer minGreaterThanSeven = 	list.
												stream().
												distinct().
												filter(t->t>7).
												filter(t->t%2==0).
												sorted(Comparator.reverseOrder()).
												reduce(Integer.MAX_VALUE, (t,u) -> u );
			
			System.out.println(minGreaterThanSeven); // 8
		}
		
		// 3.Way:
		public static void getMinGreaterThanSeven03(List<Integer> list) {
			Integer minGreaterThanSeven = 	list.
												stream().
												distinct().
												filter(t->t>7).
												filter(t->t%2==0).
												sorted().
												findFirst(). // after findFirst() we need to use get() as it returns optional 
												get();
					
			System.out.println(minGreaterThanSeven); // 8
		}
		
		//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
		public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {
			List<Double> result = list.
										stream().
										distinct().
										filter(t->t>5).
										map(t->t/2.0).
										sorted(Comparator.reverseOrder()).
										collect(Collectors.toList());
			System.out.println(result); // [65.5, 7.5, 5.0, 4.5, 4.0]
		}
		
}
