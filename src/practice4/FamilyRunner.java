package practice4;

public class FamilyRunner {

	public static void main(String[] args) {
		
									//
		ReportCard reportCard = new ReportCard(9, 9, 10, 10);
		
		Student student = new Student("Ali", "Can", 16, reportCard);
		
		Parent parent = new Parent("Veli", "Can", student.total() >=35, student);
		
		student.setParent(parent);
		
		
		System.out.println(parent);
		System.out.println("Parent status: " + parent.successMessage());
		System.out.println("Child ststau: " + student.successMessage());
		
		System.out.println(student);

	}

}
