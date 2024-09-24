/*
Author: Yaseen
Date: 06.09.2034
Purpose: Finding the area of a rectangle using the constructors.

The Room class provides functionality to represent a rectangular room and compute its area.
 */
class Room
{
    float length, breadth;

    Room(float x,float y)
    {
        length=x;
        breadth=y;
    }
    void displayData()
    {
        System.out.print("The are is: " + length * breadth);
    }
}
/*
  The Area class creates an instance of the Room class with specified dimensions
  and displays the area of the room.
*/
class Area
{
 public static void main(String []a)
 {
     Room c3=new Room(20.9f,25.9f);
     c3.displayData();
 }
}