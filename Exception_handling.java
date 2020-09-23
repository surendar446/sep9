 /*
Write a Java program for handling the following exceptions
(i)   Arithmetic Exception    (ii) ArrayIndexOutOfBounds Exception 
(iii) NumberFormatException   (iv) StringIndexOutOfBound Exception

 */
package lab_ex9;
import java.util.Scanner;

/**
 *
 * @author SONAL L R
 */
public class Exception_handling {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        try
        {
            int p=1;
            int q=0;
            int r=p/q;
        }
        catch(ArithmeticException s)
        {
            System.out.println(s);
        }
        try
        {
            System.out.println("Enter the Integer:");
            int a=Integer.parseInt(obj.next());
        }
        catch(NumberFormatException s)
        {
            System.out.println(s);
        }
        int b[]=new int[3];
        try
        {
            b[6]=19;
        }
        catch(ArrayIndexOutOfBoundsException s)
        {
            System.out.println(s);
        }
        try
        {
            String str="Good Morning";
            str.charAt(22);
        }
        catch(StringIndexOutOfBoundsException s)
        {
            System.out.println(s);
        }
    }
}