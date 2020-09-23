/*
Write a Java application for Banking transaction system that helps the users to 
do their credit transactions. Rises user defined exception while encountering 
errors during credit transaction and also solves the exception by using 
appropriate handling techniques.
 */
package lab_ex9;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Bank_transaction {
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            CheckCredit();
        }
        catch(CreditException s) //handles error
        {
            System.out.println(s.getMessage()); //to print the message alone
        }
    }
    static void CheckCredit() throws CreditException
    {
        Scanner obj=new Scanner(System.in);
        double FixedCreditableAmount=50000.00; //providing a fixed amount
        System.out.println("Enter the amount to be credited:"); //printing the credit amount
        double CreditAmount=obj.nextDouble();
        if(CreditAmount > FixedCreditableAmount) //condition
        {
            throw new CreditException("Credit amount is greater than fixed amount"); //throws the particular error
        }
        else
        {
            System.out.println("AMOUNT CREDITED");
        }
    }
}  
class CreditException extends Exception
{
    public CreditException(String message) //specifying the message
    {
        super(message); //calling super class
    }
}