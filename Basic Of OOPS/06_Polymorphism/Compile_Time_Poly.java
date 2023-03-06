
/***********************
 * Compile Time Polymorphism******************************
 * A polymorphism which is exists at the time of compilation is called compile
 * time polymorphism or early binding or static polymorphism
 * 
 * *****************Method Overloading*****************************************
 * Whenever a class contain more than one method with same name and different
 * types of parameter is called Method Overloading
 * 
 ******************************************************************************/

class A {
    void add() {
        System.out.println("Kuchh To Bhejo Bhai Add Karne Ke Liye (<.)");
    }

    void add(int c, int d) {
        int a = c + d;
        System.out.println("Two Integer Input Adition : " + a);
    }

    void add(int a, double b) {
        double c = a + b;
        System.out.println("One Integer & One Double Input : " + c);
    }

    void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("3 Integer Input Addition : " + d);
    }

    void add(double a, double b, double c) {
        double d = a + b + c;
        System.out.println("3 Double Input Addition : " + d);
    }

}

public class Compile_Time_Poly {
    public static void main(String args[]) {
        A ob = new A();
        ob.add(10, 30.5);
        ob.add(10.5, 10, 54);
    }
}

// Compiler pahle se pata laga leta hai method ke parameter se.
// method ke return type se koi matlb nhi hai kuchh bhi rakha ja sakta hai.
