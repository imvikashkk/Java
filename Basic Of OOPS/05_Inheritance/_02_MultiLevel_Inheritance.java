/*
 * In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as
 * the derived class also acts as the base class for other classes. In the below image,
 * class A serves as a base class for the derived class B, which in turn serves as a base
 * class for the derived class C. In Java, a class cannot directly access the grandparent’s
 * members.
 * 
 */
class A {

    int a, b, c;

    void add() {
        a = 100;
        b = 200;
        c = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + c);
    }

    void sub() {
        a = 250;
        b = 150;
        c = a - b;
        System.out.println("Sub of " + a + " - " + b + " = " + c);
    }

}

class B extends A {

    void multi() {
        a = 25;
        b = 65;
        c = a * b;
        System.out.println("Multiplication of " + a + " x " + b + " = " + c);
    }

    void div() {

        a = 75;
        b = 5;
        c = a / c;
        System.out.println("Division of " + a + " / " + b + " = " + c);

    }

}

class C extends B {

    void rem() {
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("Remainder of " + a + " % " + b + " = " + c);
    }

}

public class _02_MultiLevel_Inheritance {
    public static void main(String args[]) {
        C ref = new C();
        ref.add();
        ref.sub();
        ref.multi();
        ref.div();
        ref.rem();
    }
}
