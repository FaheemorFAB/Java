/*
 * Types of Access Modifiers in Java
 * There are four types of access modifiers available in Java:
 * 
 * 1. Default – No keyword required
 * 2. Private
 * 3. Protected
 * 4. Public
 * 
 * 1: When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default---> accessible only within the same package.
 * 
 * 2:  The methods or data members declared as private are accessible only within the class in which they are declared.Any other class of the same package will not be able to access these members.
 * 
 * 
 * 3: The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
 */

class BankAcc {
    public String username;
    private String password;

    // function for assigning value to password
    void setPass(String pwd) {
        password = pwd;
    }

    // function for displaying value of the variables
    void display() {
        System.out.println("User: " + username);
        System.out.println("Pass: " + password);
    }

}

public class OOPS2 {
    public static void main(String args[]) {
        BankAcc myAcc = new BankAcc(); // Creating object of BacnkAcc class as myAcc
        myAcc.username = "Numan";
        // myAcc.password="abcdefghi"; //Can not be Accessed due to pvt Access
        // modifier---->Not visible

        myAcc.setPass("abcdefghi"); // Value assigned indirectly to pvt->password using Method of the same class
        myAcc.display();
    }

}