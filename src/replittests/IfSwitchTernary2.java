package replittests;

import java.util.Scanner;

public class IfSwitchTernary2 {

	public static void main(String[] args) {
		
		
		
				
				String s1 = "John White";							
				String updateds1 = s1.replaceAll("[a-z]", "*");
						System.out.println("Name :" + updateds1);
								
				String s2 = "1234234534561478";
				String s3 = "";
				
				for(int i = 0; i <s2.length(); i++) {
					if(i<12) {
						s3+="*";
						if((i+1)%4==0) {
							s3+= " ";
						}
					}else {
						s3+=s2.charAt(i);
					}
				}
				System.out.println("CCN  :" + s3);
				
				

	}

}
