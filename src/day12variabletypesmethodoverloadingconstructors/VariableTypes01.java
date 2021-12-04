package day12variabletypesmethodoverloadingconstructors;

	/*
	 	There are 3 main variable types in Java:
	 	
	 	1) Local Variables: Variables created in method body
	 						"age" and "sum" are local variables
	 						
	 		NOTE 1: Local Variables can be used just inside the method body which you created it in.
	 		NOTE 2: Do not use Local Variables without initializing (assigning a value), otherwise you get Compile Time Error.
	 	
	 	2) Instance(Object) Variables: Variables created outside of all methods 	 	
	 		and inside the class without using "static" keyword. "name" is an instance(object) variable
	 		
	 		NOTE 1: If you want initialize the instance variable, if you want do not initialize.
	 				If you do not initialize Java will put "default values" for the instance variable.
	 				Default values:
	 				String ==> null
	 				byte - short - int - long - float - double ==> 0
	 				boolean ==> false
	 				char ==> Nothing ==> ''
	 		NOTE 2: Instance Variables are attached to every object.
	 	
	 	3) Class Variables: Variable created by using "static" keyword, "id" is a class variable.
	 	
	 		NOTE 1: Class(Static) Variables are common for all objects created from the class (like Moon).
	 		NOTE 2: Every update on Class(Static) Variables will be visible by all objects (like splitting Moon).
	 		NOTE 3: If you need a variable which all objects need to share make the variable "Class(Static) Variables"
	 				If you need all objects should see every update on a variable make the variable "Class(Static) Variables"
	 				
	 		Note for Instance and Static Variables: To access an "Instance Variable" from another class, 
	 		you have to create "object" but to access "Class Variable" from another class no need to create object, 
            you can access to a "Class Variable" by using just class name		
	 		
	 */


public class VariableTypes01 {
	
		String name = "Ali Can";  //Instance(Object) Variable
		boolean isOld;				//Instance(Object) Variable
		
		static String id;

	public static void main(String[] args) {		
		int age=13;  		//local variable		
		System.out.println(age);		
	}
	
	public static int add (int a, int b) {				
		int sum = a+b; 		//local variable		
		return sum;			//local variable
	}
	
	

}
