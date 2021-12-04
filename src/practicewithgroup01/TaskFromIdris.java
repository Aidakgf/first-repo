package practicewithgroup01;

public class TaskFromIdris {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//      *****
//      *****
//      *****
//      *****
//      *****	

		System.out.println("====================");
		

		int row = 5;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//      * 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 

		System.out.println("====================");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= row - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

//      *
//     **
//    ***
//   ****
//  *****

		System.out.println("====================");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//      *****
//      ****
//      ***
//      **
//      *

		System.out.println("====================");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= row - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//      *****
//       ****
//        ***
//         **
//          *
		
		System.out.println("====================");
	
		
		
	        //1, 3, 5
	        //0,1,2
//	        int z = 0;
		
//        for (int i = 1; i <= size; i++) {
//            if (i % 2 == 1) {
//                z++;
//                for (int j = 0; j < i/2; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = i; k <= size; k++) {
//                    System.out.print("*");
//                }
//                    System.out.println();
//            }
//		
			
			for (int i = row; i >= row; i -=2) {			
			
				for (int j = row; j > i; j -=2) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
		
//      *****
//       ***
//        *
		
//      *
//     ***
//    *****
		
		
		

		

	}

}
