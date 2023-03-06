/*

In Java, a copy constructor is a special type of constructor that creates
an object using another object of the same
Java class. It returns a duplicate copy of an existing object of the class.

We can assign a value to the final field but the same cannot be done while using the clone() method.
It is used if we want to create a deep copy of an existing object. It is easier to implement in comparison
to the clone() method.

 */

class A {
    int a;
    int b;

    A() {
        a = 10;
        b = 20;
        // System.out.println("No-Arguement Constructor : " + a + " " + b);
    }

    A(A obj) {
        this.a = obj.a;
        this.b = obj.b;
        // System.out.println("Copy Constructor: " + a + " " + b);
    }
}

public class _06_CopyConstructor {
    public static void main(String args[]) {
        A ob = new A();
        A ob2 = new A(ob);

        System.out.println(ob2.a + " " + ob2.b);
    }
}
