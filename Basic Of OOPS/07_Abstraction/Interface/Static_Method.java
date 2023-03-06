/****************
 * Static_Method*****************
 * Before JDK 1.8 , interface can only have abstract methods and all the
 * abstract
 * methods of interfaces must be Overriden in implementing class as well as
 * methods public & abstract by default.
 * 
 * 
 * Work Similar as in Class, same in interface we can access the method
 * directlty
 * without making any object ( Note: Interface doesn't allow to make object) .
 * 
 * 
 * static method can not be Overriden.
 */
interface A {

    public static void iPhone() {
        System.out.println("This is a Apple iPhone.");
    }

    public static void sam() {
        System.out.println("This is a Samsung Phone.");
    }
}

public class Static_Method {

    public static void main(String arg[]) {
        A.iPhone();
        A.sam();
    }
}
