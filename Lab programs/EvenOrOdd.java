//Author: Yaseen
//Date: 03.09.24
//Purpose: Check if the entered number is even or odd
/*
 * The EvenOrOdd class provides a simple utility to determine whether
 * an input number is even or odd.
 * The class reads an integer from the standard input, checks if the
 * number is divisible by 2, and prints either "The number is even"
 * or "The number is odd" based on the result.
 */

import java.util.Scanner;

class EvenOrOdd
{
    public static void main(String a[])
    {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        if (data % 2 == 0)
        {
            System.out.println("The number is even");
        } else
        {
            System.out.println("The number is odd");
        }
        input.close();
    }
}
