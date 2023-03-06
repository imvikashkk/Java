/************************
 * Multiple_Inheritance_Using_Interface*****************
 * We can achieve multiple inheritance through interfaces because interface
 * contains only abstract method, which implementation is provided by the sub
 * classes.
 * 
 * class c implements a,b
 * 
 */

interface A {
    void show(); // public + abstract
}

interface B {
    void show(); // public + abstract
}

public class multiple_inheritance implements A, B {
    public void show() {
        System.out.println("Multiple Inheritance : Interface A & B");
    }

    public static void main(String args[]) {
        multiple_inheritance rf = new multiple_inheritance();
        rf.show();
    }
}
