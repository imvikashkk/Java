
/****************************
 * Default_Method************************
 * Before JDK 1.8 , interface can only have abstract methods and all the
 * abstract
 * methods of interfaces must be Overriden in implementing class as well as
 * methods
 * public & abstract by default.
 * 
 * 
 * in JDK 1.8 and above has a "default" keyword which is used to avoid the
 * neccessory
 * implementing as Overriden.
 * 
 * 
 */
interface A {
    void a1(); // public + abstract

    void a2(); // public + abstract

    default void a3() { // may or may not override in subclass
        System.out.println("default keyword : interface");
    }
}

class B implements A {

    public void a1() {
        System.out.println("Class B : a1()");
    }

    public void a2() {
        System.out.println("Class B : a2()");
    }

    public void a3() {
        System.out.println("Override : Class B a3()");
    }

}

class C implements A {

    public void a1() {
        System.out.println("Class C : a1()");
    }

    public void a2() {
        System.out.println("Class C : a2()");
    }

}

class D implements A {

    public void a1() {
        System.out.println("Class D : a1()");
    }

    public void a2() {
        System.out.println("Class D : a2()");
    }

}

public class Default_Method {
    public static void main(String arg[]) {
        System.out.println("\n\n\n");

        B r1 = new B();
        C r2 = new C();
        D r3 = new D();

        r1.a1();
        r1.a2();
        r1.a3();

        r2.a1();
        r2.a2();
        r2.a3();

        r3.a1();
        r3.a2();
        r3.a3();

        System.out.println("\n\n\n");
    }
}
