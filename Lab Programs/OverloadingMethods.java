//Author: Yaseen
//Date: 07.09.2024
//Purpose: Method overloading achieving through the number of the arguments passed to the 'setData' method
/**
 * The Area1 class provides functionality for calculating the area of a rectangle or square.
 * Method overloading is utilized to achieve area calculation based on the number and type of arguments passed.
 */
class Area1
{
    float length, breadth;
    void setData(float x, float y)
    {
        length=x;
        breadth=y;
        System.out.println("The Area is: "+ length*breadth);
    }
     void setData(float side)
     {
         length=breadth=side;
         System.out.println("The Area is: "+ side*side);
     }
}
/**
 * The OverloadingMethods class demonstrates method overloading by creating instances of the Area1 class
 * and calling different overloaded versions of the setData method to compute area.
 */
class OverloadingMethods
{
    public static void main(String []a)
    {
        Area1 obj1=new Area1();
        Area1 obj2=new Area1();
        obj1.setData(22.6f,99.7f);
        obj2.setData(45.7f);

    }
}
