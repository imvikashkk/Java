/*****************************Private Method**************************
*From JDK 1.9 onwards interface can have private methods also , and we can declare this
*private method as a static or non-static.
*
*It s compulsory to implement the private method within interface.
*private mathod cannot be overriden.

*private method used to implementing by a class.
*/
/************************************************************************
 *
 * (Before 1.8)
 * interface A{ // 1995-2014
 * int a; // public + static + final
 * void a(); // public + abstract
 * }
 * 
 * 
 * (From 1.8)
 * interface A{
 * int a; // public + static + final
 * void a(); // public + abstract
 * 
 * default void b(){
 * // body of statement
 * }
 * static void c(){
 * // body of statement
 * }
 * }
 * 
 * 
 * (From 1.9)
 * interface A{
 * int a; // public + static + final
 * void a(); // public + abstract
 * 
 * default void b(){
 * // body of statement
 * }
 * 
 * static void c(){
 * // body of statement
 * }
 *
 * private void d(){
 * // body of statement
 * }
 * }
 * 
 */

interface A {
    default void call() {
        add(100, 20);
    }

    private void add(int x, int y) {
        System.out.println("Sum of two Numbers : " + (x + y));
    }
}

class B implements A {
    public void sub(int x, int y) {
        System.out.println("Sub of two no.: " + (x - y));
    }
}

public class private_method {
    public static void main(String args[]) {
        B rf = new B();
        rf.call();
        rf.sub(100, 50);

    }
}

/************************************************************************************************************/

// interface A {
// public static void call() {
// add(100, 20);
// }

// private static void add(int x, int y) {
// System.out.println("Sum of two Numbers : " + (x + y));
// }
// }

// class B implements A {
// public void sub(int x, int y) {
// System.out.println("Sub of two no.: " + (x - y));
// }
// }

// public class private_method {
// public static void main(String args[]) {
// B rf = new B();
// A.call(); // Directly Interface se call ho jayega.
// rf.sub(100, 50);

// }
// }
