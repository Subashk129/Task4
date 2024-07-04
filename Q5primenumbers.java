package Task4;

public class Q5primenumbers {

	public static void main(String[] args) {
		
		//fining Prime number or Not
		int number = 19; // Example number
		System.out.println("Your Given Number is "+number);
		
		int count = 0;
		
		for(int i=1; i<=number; i++) {
			
			if(number%i ==0) {
				count++;
		  }
		}
		if(count==2) {
			System.out.println("The Given number "+number+" is prime");
		}
		else {
			System.out.println("The Given number " +number+ " is Not prime");			
		}
	}
}
