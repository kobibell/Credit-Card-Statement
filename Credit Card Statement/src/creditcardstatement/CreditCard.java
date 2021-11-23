
package CreditCardStatement;
public class CreditCard 
{
    public int days;
    public double curBal;
    public double avgDailyBal;
    public double paymentAmt;
    public double intRate;
    public double intAmt;
    public double principleAmt;
    public double endBal; 
    public static int numMade = 0;
    
    CreditCard(int theDays, double curBalance, double interestRate, double paymentAmt)
    {
       setOther(); 
       numMade++;
       
    }
    public void setOther ()
    {
        double step2, step3, step4; 
        // The following for loop will do the final calculations to fill in the final arrays.
        for (int i = 0; i < numMade; i++)
        {
        //Solving the monthly interest rate by using the following formulas.    
        this.intAmt = this.intRate  / 12 / 100;
        
        //For the next following steps, I will use these formulas to solve the average daily balance.
        step2 = this.curBal * 31;
        step3 = this.paymentAmt * this.days;
        step4 = step2 - step3;
        this.avgDailyBal = step4 / 31;
        
        //These final formulas will be used to calculate the ending balance for the user.
        this.intAmt = this.avgDailyBal * this.intAmt;
        principleAmt = paymentAmt - intAmt;
        endBal = curBal - principleAmt;
        
        if (paymentAmt > curBal)
        {
            paymentAmt = curBal + intAmt;
            principleAmt = curBal;
            endBal = 0;
        }
        if (intAmt > paymentAmt)
        {
            endBal = curBal + (intAmt - paymentAmt);
            principleAmt = 0;
        }
        
        // Updating the accumulators for all.
        curBal += curBal;
        paymentAmt += paymentAmt;
        principleAmt += principleAmt;
        intAmt += intAmt;
        endBal += endBal;
        avgDailyBal += avgDailyBal;
        }// end for loop 
    }
    public void printCard ()
    {
        
    }
}
