package day13statickeyword;

// Type code to count the number objects created from Students class

public class Students {
	
	public String name; //instance variable
	public int age; // instance variable
	public static int numOfStudents; //static variable
	public String studentId;
	
	public Students() {
		this.name="Ali Can";
		this.age=10;
		numOfStudents++;	
		this.studentId=name.substring(0, 2) + age + numOfStudents;
	}
	
	public Students(String name, int age) {
		this.name=name;
		this.age=age;
		numOfStudents++;
		this.studentId=name.substring(0, 2) + age + numOfStudents;
	}
	
	public Students(String name) {
		this.name=name;
		numOfStudents++;
		this.studentId=name.substring(0, 2) + age + numOfStudents;
	}

	public static void main(String[] args) { 
		System.out.println("Before std1 created: " + numOfStudents);
		
		Students std1 = new Students();
		System.out.println(std1.studentId);
		System.out.println("After std1 created: " + numOfStudents);
		
		Students std2 = new Students();
		System.out.println(std2.studentId);
		System.out.println("After std1, std2 created: " + numOfStudents);
		
		Students std3=new Students("Bulent Atar, 15");
		System.out.println(std3.studentId);
		System.out.println("After std1, std2, std3 created: " + numOfStudents);
		
		Students std4=new Students("Kemal Efe");
		System.out.println(std4.studentId);
		System.out.println("After std1, std2, std3, std4 created: " + numOfStudents);
			
		}
		

	

}
