/*
                        <---------Access Modifiers-------->

There are four types of access modifiers available in Java: 

Default – No keyword required
1. Private
2. Protected
3. Public

1: When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default.--->Accessible only within the same package

2: The methods or data members declared as private are accessible only within the class in which they are declared---->Any other class of the same package will not be able to access these members.

3: The methods or data members declared as protected are accessible within the same package or subclasses in different packages.

4: Classes, methods, or data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data members.
*/

class BankAccount {
    public String username;
    private String password;

    void setpassword(String pwd) {
        password = pwd;
    }
    void display(){
        System.out.println(username);
        System.out.println(password);
    }
}

public class OOPS2 {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount(); // Creating object of class as myAcc
        myAcc.username = "Numan";
        /*
         * myAcc.password="abcdefji"
         * CAN NOT ACCESS THE PASSWORD BCZ OF PRIVATE MODIFIER-->not visible,cannot be
         * accessed outside the class
         */

        myAcc.setpassword("abcdefgi"); // pass set through function which is in the class
        
        //Will display the username and password
        myAcc.display();  
    }
}
