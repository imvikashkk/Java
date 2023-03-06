package Abstract;

/**********************************
 * Abstract Method****************************
 * A Method which contain abstract modifier at the time of declairation
 * is called abstract Method.
 * 
 * 
 * RULE :
 * 1. It can only be used in abstract class.
 * 2. It doesn't contain body.
 * 3. Abstract Method must be overridden in sub classes otherwise
 * it will become a abstract class.
 * 4. Whenever the action is common but implementation are different
 * then we should use abstract method.
 * 
 * ********************************************************************************
 */

// abstract class Programming {
// abstract void Developer();
// }

// class HTML extends Programming {
// @Override
// void Developer() {
// System.out.println("HTMl with SunRise");
// }
// }

// class JAVA extends Programming {
// @Override
// void Developer() {
// System.out.println("JAVA with ColdMoon");
// }
// }

// class CPP extends Programming {
// @Override
// void Developer() {
// System.out.println("CPP with LivingLoveEarth");
// }
// }

// public class _01_01_Abstract_Method {
// public static void main(String args[]) {
// HTML hm = new HTML();
// JAVA jv = new JAVA();
// CPP cl = new CPP();

// hm.Developer();
// jv.Developer();
// cl.Developer();
// }
// }

abstract class Programming {
    abstract void Developer();

    abstract void Rank();

    abstract void Work();
}

abstract class HTML extends Programming {

    @Override
    void Developer() {
        System.out.println("HTMl with SunRise");
    }

    @Override
    void Rank() {
        System.out.println("Rank : Nahi Pata");
    }

}

abstract class JAVA extends HTML {

    @Override
    void Developer() {
        System.out.println("JAVA with ColdMoon");
    }

    @Override
    void Rank() {
        System.out.println("Rank : Pata Hai");
    }

}

class CPP extends JAVA {
    @Override
    void Developer() {
        System.out.println("CPP with LivingLoveEarth");
    }

    void Work() {
        System.out.println("Hai Kuchh Kam");
    }
}

public class _01_01_Abstract_Method {
    public static void main(String args[]) {
        CPP cl = new CPP();

        cl.Developer();
        cl.Rank();
    }
}
