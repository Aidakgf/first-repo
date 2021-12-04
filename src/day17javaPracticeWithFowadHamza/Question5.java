package day17javaPracticeWithFowadHamza;

public class Question5 {

	public static void main(String[] args) {
		// 12=1,2,3,4,6,12

		// 6=1,2,3,6
		// Common factrs = 1,2,3,6
		int hcf = 0;
		System.out.println("Please provide first number and press Enter: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Please provide second number and press Enter: ");
		int num2 = scan.nextInt();
		for (int i = 1; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}
		System.out.println("the HCF is " + hcf);
	}

}
