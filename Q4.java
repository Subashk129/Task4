package Task4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		int a,b,x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to swap a & b :");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping the Numbers: "+a+" "+b);
		
		//Swapping
		x= a;
		a= b;
		b= x;
		
		System.out.println("After Swapping: "+a+" "+b);
		//System.out.println();

	}

}
