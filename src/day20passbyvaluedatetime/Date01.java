package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import day21accessmodifiersstringbuildervarargs.Student;

public class Date01 extends Student{

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());  //  2021-10-29
		System.out.println(LocalTime.now());  //  11:29:02.011437 (nanoseconds)
		System.out.println(LocalDateTime.now());  // 2021-10-29T11:29:47.082157
		
		// How to manipulate date
		LocalDate currentDate = LocalDate.now();
		currentDate = currentDate.plusDays(7);
		System.out.println("The date after 7 days: " + currentDate); // The date after 7 days: 2021-11-05
		
		currentDate = currentDate.minusDays(3);
		System.out.println("3 days before " + currentDate); // 3 days before 2021-11-02
		
		currentDate = currentDate.plusMonths(6);
		System.out.println("After 6 month: " + currentDate); // After 6 month: 2022-05-02
		
		currentDate = currentDate.plusYears(4).minusMonths(3).plusDays(17);
		System.out.println("After the method chain: " + currentDate); // After the method chain: 2026-02-19
		
		LocalDate dob = currentDate.of(2000, 11, 23);
		System.out.println(dob); // 2000-11-23
		
		System.out.println(currentDate.MAX); // +999999999-12-31
		
		System.out.println(currentDate.EPOCH); // 1970-01-01 (The date computers start to measure system time)
		
		// How to manipulate time
		LocalTime currentTime = LocalTime.now();
		Integer hour = currentTime.getHour();
		System.out.println(hour); // 11
		
		// Print the time 20:30
		LocalTime time = currentTime.of(20, 30);
		System.out.println(time);  // 20:30
		
		boolean isAfter = currentTime.isAfter(time);
		System.out.println(isAfter);  // false
		
		System.out.println(currentTime.MIDNIGHT); // 00:00
		System.out.println(currentTime.NOON);     // 12:00
		System.out.println(currentTime.MAX);      // 23:59:59.999999999
		System.out.println(currentTime.MIN);      // 00:00
		  
		
	
	

		
		
		
		
		

	}

}
