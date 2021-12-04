package replittests;

public class If_Switch_Ternary_StringMethods_7 {

	public static void main(String[] args) {
		
		String name1 = "mehmet";
		String name2 = "ahmet";
		
		String result = name1.length()%2==0 ? 
				name1.substring(0, name1.length()/2) + name2 +
				name1.substring(name1.length()/2) : 
					name2 + " cannot be inserted in the " + name1;	
		
		System.out.println(result);
				
		
		
		
		

	}

}
