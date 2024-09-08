// Author: Yaseen
// Date:04.09.2024
// Purpose: Printing the fibonacci series using java of 20 fibonacci numvbers
/*
 * The Fibonacci class contains a main method that prints the first 20 numbers in the Fibonacci sequence.
 * It initializes the sequence with the first two numbers (0 and 1) and iteratively calculates the next numbers.
 * The sequence is printed to the console.
 * The loop runs until 18 additional numbers beyond the initial two have been printed.
 */
class Fibonacci {
    public static void main(String[] args) {
        int count = 0, p = 0, q = 1;
        System.out.print(p + " " + q);

        while (true) {

            System.out.print(" " + (p + q));
            int temp = p + q;
            p = q;
            q = temp;
            count++;
            if (count == 18)
                return;

        }
    }
}
