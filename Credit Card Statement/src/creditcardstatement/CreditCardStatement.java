
package CreditCardStatement;
import java.util.ArrayList;
import java.util.Scanner;
public class CreditCardStatement 
{

    public static void main(String[] args) 
    {
        CreditCard [] theClass = new CreditCard [50]; 
      
    }
    
    public static void returnAll (CreditCard theC[])
    {
        // Calling scanner for user's input.
        Scanner input = new Scanner(System.in);
        
        // Priming read
        System.out.print("Enter current balance in dollars and cents: ");
        theClass.curBal [CreditCard.numMade] = input.nextDouble();
        
        // The following counter is used count how many spots of the array been filled for each element.
        while (theC[].curBal [CreditCard.numMade] > 0 )
        {
        // Calling individuals functions to store the values into the seperate arrays.
            System.out.print("Enter monthly payment made in dollars and cents: ");
            payment [CreditCard.numMade] = input.nextDouble(); 
        
            System.out.print("Enter the days before statement date: ");
            days [CreditCard.numMade] = input.nextInt(); 
        
            System.out.print("Enter annual interest rate in percent: ");
            intRate [CreditCard.numMade] = input.nextDouble();
            System.out.println();
        
            // Priming read.
            System.out.print("Enter current balance in dollars and cents: ");
            curBal [CreditCard.numMade] = input.nextDouble();
        
        } // end while loop  

    }
    
}
