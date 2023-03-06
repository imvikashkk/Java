/*
 * A inheritance which contain only one super class and multiple sub class
 * directly extends super class called hierarchical inheritance.
 */

class A {
    void input() {
        System.out.println("What is your name: ");
    }
}

class B extends A {
    void p1() {
        System.out.println("My name is Vikash Kumar\n");
    }
}

class C extends A {
    void p2() {
        System.out.println("My name is Vishal Kumar\n");
    }
}

class D extends A {
    void p3() {
        System.out.println("My name is Ayush Kumar\n");
    }
}

class _04_Hierarchical_Inheritance {

    public static void main(String[] args) {
        B ob1 = new B();
        C ob2 = new C();
        D ob3 = new D();

        ob1.input();
        ob1.p1();

        ob2.input();
        ob2.p2();

        ob3.input();
        ob3.p3();

    }

}