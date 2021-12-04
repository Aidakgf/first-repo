package practice4;

public class Student implements HonorAward{
	
	private String name;
	private String lastname;
	private int age;
	private ReportCard reportCard;
	
	// POJO
	// plain old java objects
	
	private Parent parent;
	
	
	

	
	public Student() {
	}
	
	
	


	public Student(String name, String lastname, int age, ReportCard reportCard) {
		
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.reportCard = reportCard;
	}
	
	
	





	public Student(String name, String lastname, int age, ReportCard reportCard, Parent parent) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.reportCard = reportCard;
		this.parent = parent;
	}





	public int total() {
		int total = reportCard.getEnglishGrade() + reportCard.getJavaGrade() + 
				reportCard.getMathGrade() + reportCard.getScienceGrade();
		
		
		// 0 - 10 => 40 // 9 8 10 9 
		return total;
	}
	
	
	@Override
	public String successMessage() {
		// 35
		String message = "You need to make more efforts! Almost there!";
		
		if(total() >= 35 ) {
			message = "Congratulations! You have obtained great results! Keep it up!";
		}
		
		
		
		return message;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public ReportCard getReportCard() {
		return reportCard;
	}




	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", age=" + age + ", reportCard=" + reportCard + "]";
	}





	public Parent getParent() {
		return parent;
	}





	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	
	
	
	

}
