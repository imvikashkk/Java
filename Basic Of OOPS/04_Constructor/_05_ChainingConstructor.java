/*
 Constructor chaining is the process of calling one constructor from another constructor
 with respect to current object. 

One of the main use of constructor chaining is to avoid duplicate codes while having multiple
constructor (by means of constructor overloading) and make code more readable. 


Constructor chaining can be done in two ways: 
    Within same class: It can be done using this() keyword for constructors in the same class
    From base class: by using super() keyword to call the constructor from the base class.
 */

class Vikash {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class

    Vikash() { // No-Arguement Constructor
        this(10);
        System.out.println("Constructor 2");
    }

    Vikash(int i) { // Constructor 1
        this(i, 20);
        System.out.println("Constructor 2 : " + i);
    }

    Vikash(int j, int k) {
        this(j, k, 30);
        System.out.println("Constructor 3 : " + (j * k));
    }

    Vikash(int s, int r, int t) {
        System.out.println("Constructor 4 : " + (s * r * t));
    }
}

public class _05_ChainingConstructor {
    public static void main(String args[]) {
        Vikash obj = new Vikash();
    }
}
