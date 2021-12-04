package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

	public static void main(String[] args) {
		
		// Find the longest word in a String
		
		String s = "ALi Can went to school to learn";
		
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words)); //[ALi, Can, went, to, school, to, learn]
		
		
		
//		Arrays.sort(words, Comparator.comparing(String::length));
//		System.out.println(Arrays.toString(words)); //[to, to, ALi, Can, went, learn, school]
//		System.out.println(words[words.length-1]);  // school		
		
		
		Arrays.sort(words, Comparator.comparing(String::length).reversed()); //[school, learn, went, ALi, Can, to, to]
		System.out.println(Arrays.toString(words));		
		System.out.println(words[0]);
		
		// Get just the year from date in the "mm/dd/yyyy" format
		
		String date = "10/05/2021";		
		String arr[] = date.split("/");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]); //2021   
		
		
		// Get the initials of the student names
		String t = "Ali Can, Veli Han, Mary Star went to school by bus";
		
		String u[] = t.split(", "); // u = [Ali Can, Veli Han, Mary star went to school by bus] ==> u[0]=Ali Can, u[1]=Veli Han, u[2]=Mary Star....
		System.out.println(Arrays.toString(u));
		
		String initials ="";
		
		for(int i = 0; i<u.length; i++) {
			
			int idx = u[i].indexOf(" ");
			initials = u[i].substring(0, 1) + u[i].substring(idx + 1, idx + 2);
			System.out.print(initials + " ");			
		}
		
		
		
		

		
		

	}

}
