/*****************
 * Covariant return type******************
 * Before this concept genrally we cnnot change the return type of overridden
 * method but new
 * concept introduced in java called co-variant where we can change the return
 * type of overridden method.
 * 
 * 
 */

class A {
    A m1() {
        System.out.println("Vikash Khunte");
        return this; // this--> new A()
    }
}

class B extends A {

    // B m1(){
    // System.out.println("Vishal Khunte");
    // return this; //
    // }

    @Override
    B m1() {
        System.out.println("Vishal Khunte");
        return this;
    }

}

public class covar {
    public static void main(String Arg[]) {
        B rf = new B();
        rf.m1();
    }
}
