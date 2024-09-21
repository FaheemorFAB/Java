//Author: Yaseen
//Date: 03.09.24
//Purpose: Check if the entered number is Prime, Composite or Neither
/**
 * The PrimeCheck class provides a method to check if a given number is a prime number.
 * It reads an integer input from the user and determines if it is a prime number, a composite number,
 * or if it falls under special cases such as zero or one.
 */
import java.util.Scanner;
class PrimeCheck
{
    public static void main(String[] a)
    {
        int fact=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n=input.nextInt();
        input.close();
        if(n<0)
        {
            System.out.print("Enter a positive number");
            return;
        }

        else if(n==0 || n==1)
        {
            System.out.print("Neither prime nor composite");
            return;
        }
        for (int i=1;i<n/2;i++)
        {
            if (n%i==0)
            {
                fact++;
            }
        }
        if(fact==1)
        {
            System.out.print("The number is Prime");
        }
        else 
        {
            System.out.print("The number is not Prime But Composite");
        }
        
    }
}