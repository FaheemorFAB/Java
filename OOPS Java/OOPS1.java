/*

Classes and Objects
Objects: Entities in the real world.
Classes: Group of these Entities

*/


// Class
class Student 
{
    //->Attributes

    String name;
    int age;
    float Average;


    /*
    Class Method 
    for calculating Average
    */ 
 
    void calcAvg(int phy, int chem, int math)
    {
        Average = (phy + chem + math) / 3;
    }

    void display() 
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(Average);
    }
}



//Visualize this as int main() of c++ {}

public class OOPS1 
{
    public static void main(String args[]) 
    {
        Student S = new Student(); // Created the Student object called S
        S.name = "Numan";
        S.age = 20;
        S.calcAvg(89, 78, 90);

        S.display();
    }

}

