/****************************************
 * Encapsulation*****************************************
 * Encapsulation is defined as the wrapping up of data under a single unit. It
 * is the mechanism
 * that binds together code and the data it manipulates. Another way to think
 * about encapsulation
 * is, that it is a protective shield that prevents the data from being accessed
 * by the code outside
 * this shield.
 * 
 * Technically in encapsulation, the variables or data of a class is hidden from
 * any other class
 * and can be accessed only through any member function of its own class in
 * which it is declared.
 ***********************************************************************************************/

class A {
    private int value; // data hiding

    public void setvalue(int value) { // data abstraction
        this.value = value;
    }

    public int getvalue() {
        return value;
    }

}

public class _00_Encapsulation {
    public static void main(String args[]) {
        A ref = new A();
        ref.setvalue(10);

        System.out.println(ref.getvalue());
    }
}
