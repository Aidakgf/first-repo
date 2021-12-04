package day01variables;

public class Variables02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Data Types in Java
        Note: In Java, there are 2 main data types
        
              1)Primitive Data Types: 
                    a)boolean: It has 2 different values which are "true" and "false"
                               Every boolean variable uses a single "bit" in memory
                               booleans have "false" as default value
                    b)char: It is used for single characters
                            Value must be put between single quotes like 'S'
                            Every char uses 16 bits in the memory
                    c)byte: It is used for "whole numbers" between -128 and 127
                     		It uses 8 bits from memory
                     		If you are not sure the value will be between -128 and 127, do not use 
                     		byte data type
                    d)short:  
                    e)int 
                    f)long 
                    g)float 
                    h)double
                    
              Note: "=" is used to assign value to a variable
                    "==" is used to compare 2 values if they are equal to each other
                    "!=" means "not equal to"
                    
              Note: If all values in an operation is integer the result will be integer in Java
                    If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part.
                    Java do not do "rounding" operation
              
              2)Non-Primitive Data Type
              
              */
		
		byte age = 12;
		System.out.println("Age: " + age); //12
		
		short populationOfAVillage = 2000;
		System.out.println("Population: " + populationOfAVillage);
		
		int profit = 2000000000;
		System.out.println("The profit: $" + profit);
		
		long numberOfCellsInHuman = 6465346854387653874L;
		System.out.println("The number of cells in a human: " + numberOfCellsInHuman);
		
		float f = 1.2F;
		System.out.println("The value: " + f);
		
		double d = 1.2;
		System.out.println("The value: " + d);
		
		String stdName = "Ali Can";
		System.out.println("Student name: " + stdName);
		
		System.out.println(stdName.toUpperCase()); //ALI CAN
		System.out.println(stdName.toLowerCase()); //ali can		
		System.out.println(stdName.contains("i")); //true		
		System.out.println(stdName.contains("x")); //false
		
		
		
}

}
