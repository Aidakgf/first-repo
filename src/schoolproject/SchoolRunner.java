package schoolproject;

public class SchoolRunner {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.setName("Omar");
		std.setLastname("Sensei");
		std.setDepartmentName(ITDepartment.NAME);
		std.setId(101);
		
		
		Instructor ins = new Instructor();
		ins.setName("Suleyman");
		ins.setLastname("Alptekin");
		ins.setId(202);
		ins.setDepartmentName(ITDepartment.NAME);
		
		
		std.setInstructor(ins);
		
		
		// It can only be reference type // Object type
		ITDepartment it 				=	std;
		
		
		School sch = it;
		
		System.out.println("Student name: " + sch.student().getName());
		System.out.println("Student lastname: " + sch.student().getLastname());
		System.out.println("Student id: " + sch.student().getId());
		System.out.println("Student instructor: " + sch.student().instructor().getName());
		System.out.println("Department name: " + sch.departmentName());
		

	}

}
