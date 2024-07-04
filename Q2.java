package Task4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter the Number to Check: ");
		//Getting number from User
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.print("This is Even Number");
		}else {
			System.out.print("This is Odd Number");
		}
	}
}
