//Author: Yaseen
//Date: 03.09.24
//Purpose: Display elements of the array using ForEach
/**
 * The ForEach class provides a demonstration of iterating through an array
 * using the enhanced for-loop (for-each loop) in Java.
 *
 * The main method initializes an array of integers and prints each element
 * using a for-each loop.
 */
class ForEach
{
    public static void main(String []a)
    {
        int[] Marks={1,2,3,4,5};
        for(int item:Marks)
        {
            System.out.println(item);
        }
    }
}