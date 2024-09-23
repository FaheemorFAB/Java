/*
Encapsulation: Encapsulation is defined as wrapping up of Data & Methods under a singel Unit. It also implements data hiding.



                                         <-------Constructors------>

Constructors is a special method which is invoked automatically at the time of Object Creation.

- Constructors have the same name as class or structure
- Constuctors don't have a return type. (Not even void)
- Constructors are only called once, at object Creation.
- Memory allocation happens when constructor is called.

                     <---------Types of Constructors--------->

1. Non-Parameterized Constructor
2. Parameterized Constructor
3. Copy Contructor Constructor


 */
// class Student {
//     String username;
//     int rollno;

//     Student() {                             // Non-Parameterized Constructor
//         System.out.println("<---Non-Parameterized Constructor Called--->");
//     }

//     Student(String username, int rollno) {  //Parameterized Constructor
//         System.out.println("<---Parameterized Constructor Called--->");
//         this.username = username;
//         this.rollno = rollno;
//     }

//     void display(){
//         System.out.println(username);
//         System.out.println(rollno);
//     }
// }

// public class OOPS4 {
//     public static void main(String args[]) {
//         Student s1 = new Student();   //for--->Non parameterized contructor;
//         Student s2 = new Student("Numan",220319);
//         s2.display();
//     }
// }

//                            <------ 3. Copy Contructor Constructor------>

class Student {
    String username;
    int rollno;
    String password;

    Student() {
        username = "Numan";
        rollno = 220319;
        password = "pass321";
    }

    Student(Student s1) {                      // Copy contructor taking existing object as parameter i.e "s1"
        System.out.println("<------Copy Constructor Called------>");
        this.username = s1.username;
        this.rollno = s1.rollno;
        this.password = s1.password;
    }

    void display() {
        System.out.println("User: " + username);
        System.out.println("Rollno: " + rollno);
        System.out.println("Pass: " + password);
    }

}

public class OOPS4 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(s1);              // Copying s1 into s2 object
        s2.display();

    }
}
