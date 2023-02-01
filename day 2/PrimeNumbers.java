package week2.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int a,b=13;

		

				// Declare a boolean variable flag as false
		boolean flag= false;

				

				// Iterate from 2 to half of the input
        for (a=13;a<=a/2;a++) {
        	// Divide the input with each for loop variable and check the remainder
        	if (a%b==0)
        		// Set the flag as true when there is no remainder
        		flag=true;
        }
        
					// Set the flag as true when there is no remainder
        if(flag==false)

						
					// break the iterator
        	// Print 'Prime' when the condition matches

        System.out.println("13 is a prime number");
				// Check the flag (Provide a condition)

        else {

			// Print 'Not a Prime' when the condition doesn't match 
        	System.out.println("13 is not a prime number");
        }

					// Print 'Prime' when the condition matches

					


		// TODO Auto-generated method stub

	}

}
