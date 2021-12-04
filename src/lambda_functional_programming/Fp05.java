package lambda_functional_programming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fp05 {

	public static void main(String[] args) {
		
		Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        
        System.out.println(checkAvgScoresToBeGreatThanGivenNumber(coursesList, 91)); // true
        System.out.println(checkIfAnyCourceNameContainsGivenWord(coursesList, "Turkish")); // true
        System.out.println(getCourceNameWhoseAvgIsTheHighest(coursesList));
        System.out.println(sortCoursesWithAvgScoreInAscendingSkipFirstGiven(coursesList, 3L));
        System.out.println(getThirdAfterSortingInAscending01(coursesList, 3));
        System.out.println(getThirdAfterSortingInAscending02(coursesList, 3));

	}
	
	
	//1)Create a method to check if all average scores are greater than given number
	public static boolean checkAvgScoresToBeGreatThanGivenNumber(List<Courses> list, double avgScore) {
		return list.stream().allMatch(t->t.getAverageScore()>avgScore);
	}
	
	
	//2)Create a method to check if at least one of the course names contains given word
	public static boolean checkIfAnyCourceNameContainsGivenWord(List<Courses> list, String word) {
		return list.stream().anyMatch(t->t.getCourseName().contains(word));
	}
	
	
	//3)Create a method to print the course whose average score is the highest
	public static String getCourceNameWhoseAvgIsTheHighest(List<Courses> list) {
		Courses obj = list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get();
		return obj.getCourseName();
	}
	
	
	//4)Sort the list elements according to the average score in ascending order and skip first 2 elements
	public static List<Courses> sortCoursesWithAvgScoreInAscendingSkipFirstGiven(List<Courses> list, Long num) {
		return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
	}
	
	
	//5)Sort the list elements according to the average score in ascending order and print just the given one
	// 1.way:
	public static List<Courses> getThirdAfterSortingInAscending01(List<Courses> list, int num) {
		return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num-1).limit(1).collect(Collectors.toList());
		
	}
	// 2.way
	public static Courses getThirdAfterSortingInAscending02(List<Courses> list, int num) {
		return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num-1).findFirst().get();
		
	}

}
