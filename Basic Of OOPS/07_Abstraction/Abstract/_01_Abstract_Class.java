package Abstract;

/****************************************
 * Abstract_Class**************************************
 * A class which contains abstract class in its declairation is called abstract
 * class.
 * 
 * NOTE :
 * 1. We cannot create objects.
 * 2. it may or may not contains abstract class.
 * 3. It can have abstract and non-abstract class.
 * 4. To use an abstract class, you have to inherite it from dub class.
 * 5. If a class contain partial implemantation then we should declare a
 * class a abstract.
 * 
 **********************************************************************************************/

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is Barking ");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion is Roar ");
    }
}

public class _01_Abstract_Class {
    public static void main(String args[]) {
        Dog d = new Dog();
        Lion l = new Lion();

        d.sound();
        l.sound();

    }
}
