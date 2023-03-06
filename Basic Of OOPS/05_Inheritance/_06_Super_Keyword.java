/*
 * Super keyword refers to the objects of super class, it is used when we want to call the
 * super class variable, method & constructor through sub class object.
 *  
 * Rules :-
 *    1. Whenever the super class & sub class variable and method name both are same 
 *       then it can be only.
 *    2. To avoid the confusion between super class and sub classes variables and
 *       methods that have saame name, we should use super keyword.
 *    3. when call the constructor of super class from sub class. it is required for paramerized 
 *       constructor of super class.
 */

/***************************************
 * For Variable
 ******************************************/

// class A {
//     int a = 100;
// }

// class B extends A {
//     int a = 10;

//     void show() {
//         System.out.println(a);
//         System.out.println(super.a);
//     }
// }

// public class _06_Super_Keyword {
//     public static void main(String args[]) {
//         B ref = new B();
//         ref.show();
//     }
// }

/********************************************
 * For Method
 *****************************************/

// class A {
//     void disp() {
//     System.out.println("Super Class");
// }
// }

// class B extends A {
//     void disp() {
//          super.disp(); // super class
//          System.out.println("Child Class"); // sub class
//     }
// }

// public class _06_Super_Keyword {
//    public static void main(String args[]) {
//        B ref = new B();
//        ref.disp();
//    }
// }

/**************************************
 * For Constructor
 ***************************************/

class A {
    A(int a) { // parametrized
        System.out.println("Value of passed parametre: " + a);
        // A() { // No-arguement default constructor
        System.out.println("Super Class Constructor");
    }
}

class B extends A {
    B() {

        /*
         * super(); here compiler automatically create a super constructor,
         * so when we create the object of B then first A() constructor would be execute
         * then B() execute.
         * when we define super() costructor then no changes between both output.
         * if A() constructor is parameterized constructor.
         * then super() constructor must required for pass the value using it.
         * 
         */
        super(10); // ye sirf constructor ander hi use hoga.
                   // it is neccessory for parametrized A() Constructor
        System.out.println("Sub Class Constructor");
    }
}

public class _06_Super_Keyword {
    public static void main(String args[]) {
        B ref = new B();
    }
}