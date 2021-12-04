package practice4;

public class Parent implements HonorAward{
	
	
	private String name;
	private String lastname;
	private boolean honorStudent;
	private Student student;
	

	
	public Parent() {
	}
	
	
	public Parent(String name, String lastname, boolean honorStudent, Student student) {
		
		this.name = name;
		this.lastname = lastname;
		this.honorStudent = honorStudent;
		this.student = student;
	}
	


	@Override
	public String successMessage() {
		
		String message = "Please spend more time with " + student.getName();
		
		if(student.total() >= 35 ) {
			message = "Congratulations! You have an amazing child who honors everyone!";
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

	public boolean isHonorStudent() {
		return honorStudent;
	}

	public void setHonorStudent(boolean honorStudent) {
		this.honorStudent = honorStudent;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	@Override
	public String toString() {
		return "Parent [name=" + name + ", lastname=" + lastname + ", honorStudent=" + honorStudent + ", student="
				+ student + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
