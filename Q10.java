package Task4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer: ");
		
		int number = sc.nextInt();
		
		int digitCount = countDigits(number);
		
		System.out.println("Number of Digits: "+ digitCount);
		
	}
	//function to count the number of digits in an integer
	
	public static int countDigits(int number) {
		//converting and get length
		return String.valueOf(number).length();
	}

}
