// Aurhor: Yaseen
// Data: 24.09.2024
// Purpose: Reversing an array and checking if it is palindrome or not
import java.util.Scanner;
class Array1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);

        // Input array elements
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Display original array
        System.out.println("The normal array is:");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Reverse the array
        int j = 4;
        for (int i = 0; i < 5; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            if (j <= i)
                break;   
        }

        // Display reversed array
        System.out.println("\nThe reversed array is:");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Check if the array is a palindrome
        j=4;
        boolean isPalindrome = true;
        for (int i = 0 ; i < j; i++) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
           j--; 
        }
        
        //printing is palindrome or not
        if (isPalindrome) {
            System.out.println("\nThe array is a palindrome.");
        } else {
            System.out.println("\nThe array is not a palindrome.");
        }

        input.close();
    }
}
