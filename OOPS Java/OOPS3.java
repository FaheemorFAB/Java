/*                               <-------Getters & Setters------->

Get: to return the value--->return the values which is stored in variables

Set: to modify the value or set the value into the variables---> used to set value to pvt variables which can't be accessed

this: this keyword is used to refer to the current object.

*/

class Pen {
    private String color;
    private int tip;

                    // <----this refers to the current obj which in this case is "P"------>

    String getColor() {           // Getter---> returns the stored value
        return this.color;
    }

    int getTip() {             // Getter---> returns the stored value
        return this.tip;
    }

    void setColor(String newColor) {       // Setter---> Stores the value into the variable color
        this.color = newColor;
    }

    void setTip(int newTip) {              // Setter---> Stores the value into the variable tip
        this.tip = newTip;
    }

}

public class OOPS3 {
    public static void main(String args[]) {

        Pen P = new Pen();             // creating obj "P" of the class Pen
        P.setColor("Blue");  
        P.setTip(5);
        System.out.println(P.getColor());
        System.out.println(P.getTip());

    }
}
