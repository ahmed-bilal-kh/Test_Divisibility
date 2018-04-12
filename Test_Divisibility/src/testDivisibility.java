import java.util.*;

public class testDivisibility {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int dividend;
		int divisor1;
		int divisor2;
		int divisible1;
		int divisible2;
		

		System.out.print("Enter dividend:");
		 dividend = keyboard.nextInt( );
		 keyboard.nextLine( );
		System.out.print("Enter first divisor:");
		 divisor1 = keyboard.nextInt( );
		 keyboard.nextLine( );
		System.out.print("Enter second divisor:");
		 divisor2 = keyboard.nextInt( );
		 keyboard.nextLine( );
		 
		 divisible1 = dividend % divisor1;
		 divisible2 = dividend % divisor2;
		 

		if (divisor1 > dividend || divisor2 > dividend)
		{
			System.out.println("Unable to complete program... one of the divisors is too large.");
		}    
		else if (divisible1 != 0 && divisible2 != 0)
		{	
		   	System.out.printf("%d is divisible by neither %d nor by %d.", dividend, divisor1, divisor2);
		} 
		else if (divisible1 != 0 && divisible2 == 0)
		{	
	    	System.out.printf("%d is divisible only by %d.", dividend, divisor2);
		}    
	    else if (divisible1 == 0 && divisible2 != 0)
		{
		    System.out.printf("%d is divisible only by %d.", dividend, divisor1);
	    }
		else if (divisible1 == 0 && divisible2 == 0)
		{	
			System.out.printf("%d is divisible by both %d and by %d.", dividend, divisor1, divisor2);
		}
	}
}
