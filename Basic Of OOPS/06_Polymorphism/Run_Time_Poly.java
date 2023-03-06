/***************
 * Run_Time_Polymorphism*********************************
 * A polymorphism which exist at the time of execution of program
 * is called runtime polymorphism.
 *
 * *******************Method_Overriding*******************************
 * Whenever we writing method in super and sub classes in such a way
 * that method name and parameter must be same called method overriding.
 * 
 *************************** RULES**********************************
 * Method Overriding Can not be perform without inheritance.
 * So Run_Time_Poly must have inheritance.
 * 
 * method // First check that method is in super class or not
 * / \
 * Yes No(Compilation Error)
 * |
 * overriden
 * / \
 * Yes No
 * call sub Call Super
 * class Method class method
 * 
 *
 ******************************************************************/

class shape {
    void draw() {
        System.out.println("Can't say shape type");
    }
}

class square extends shape {

    @Override
    void draw() {
        System.out.println("Square Shape");
    }
}

public class Run_Time_Poly {
    public static void main(String args[]) {
        shape ref = new square();
        ref.draw();
    }
}
