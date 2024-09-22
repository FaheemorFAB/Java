//Author: Yaseen
//Date: 03.09.24
//Purpose: Find the factorial of the entered number
/**
 * The FindFact class provides a method to calculate and display the factorial of a given number.
 * It reads an integer input from the user, calculates its factorial, and prints the result.
 *
 * The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
 * For example, the factorial of 5, denoted as 5!, is 5 * 4 * 3 * 2 * 1 = 120.
 */
import java.util.Scanner;
class FindFact
{
    public static void main(String[] a)
    {
        int fact=1;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num=input.nextInt();
        for (int i=num;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.print("The factorial of " + num + " is " + fact);
        input.close();
    }
}