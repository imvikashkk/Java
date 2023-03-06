
/******************INTERFACE******************
 * Interface is just like a class, which contain only abstract method.
 * To achieve interface java provides a keyword called "implements".
 * 
 * NOTE : 1. Interface methods are by default public and abstract.
 * 2. Interface variable are by default public + static + final.
 * 3. Interface method must be overriden inside the implementing classes.
 * 4. Interface nothing but deals between client & developer.
 * 
 */
import java.util.*;

interface client {

    void input(); // public + abstract by default

    void output(); // public + abstract by default

}

class _Interface implements client {

    String name;
    double sal;

    @Override
    public void input() { // must be public
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the UserName : ");
        name = sc.nextLine();
        System.out.print("Enter the Salary : ");
        sal = sc.nextDouble();
        sc.close();
    }

    @Override
    public void output() { // must be public
        System.out.println("\n" + name + " : " + sal);
    }

    public static void main(String ars[]) {
        client c = new _Interface();
        c.input();
        c.output();
    }

}
