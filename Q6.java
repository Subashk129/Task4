package Task4;

public class Q6 {

	public static void main(String[] args) {
		
		//factorial
		int num = 7; //7*6*5*4*3*2*1
		
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial: "+fact);
	}

}
