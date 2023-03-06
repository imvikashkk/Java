/*
 * Instance block is similar to method which has no name , 
 * it can be written inside a class only, but not inside a method.
 * 
 * NOTE :
 *      -> It always execute before the constructor
 *      -> We can use variable only inside the instance block not method.
 *      -> We write time consuming code inside a instance block like JDBC connectivity.
 */

class InstanceBlock {
    public static void main(String[] args) {
        A obj = new A();
    }
}

class A {
    A() {
        System.out.println("Constructor Call");
    }

    {
        System.out.println("Instance Block Call ");
    }
}