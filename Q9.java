package Task4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		// finding Senior or not
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Age:");//getting from user
		
		int age = scanner.nextInt();
		
		if(age>=60) {
			System.out.println("your a senior citizen");
		}
		else {
			System.out.println("Your Not Senior citizen");
		}
	}

}
