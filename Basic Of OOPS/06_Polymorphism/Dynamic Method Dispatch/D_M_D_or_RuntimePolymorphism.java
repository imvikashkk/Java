/*
 *Dynamic Method Dispatch
 * Run Time PolyMorphism
 * 
 * 
 *When an overridden method is called through a superclass reference, Java determines which 
  version(superclass/subclasses) of that method is to be executed based upon the type of the 
  object being referred to at the time the call occurs. Thus, this determination is made at run
  time.
 * 
 * At run-time, it depends on the type of the object being referred to (not the type of the
 * reference variable) that determines which version of an overridden method will be executed
 * 
 * A superclass reference variable can refer to a subclass object. This is also known as upcasting.
 * Java uses this fact to resolve calls to overridden methods at run time.
 * 
 * upcasting:
 *                 ______________
 *                 | SUPERCLASS |
 *                 |____________|
 *                       ^
 *                       | extends
 *                       |
 *                  ___________
 *                  |SUBCLASS |
 *                  |_________|
 * 
 *         SuperClass obj = new SubClass();           // Allowed
 * 
 *         SubClass obj = new SuperClass();    // Not Allowed, Error
*/
class Phone {

    void name() {
        System.out.println("This is Phone");
    }

    void PYear() {
        System.out.println("Phone Year 2019 ");
    }
}

class Smart_Phone extends Phone {

    void name() {
        System.out.println("This is a Smart Phone");
    }

    void LYear() {
        System.out.println("Launching Year is 2022");
    }
}

public class D_M_D_or_RuntimePolymorphism {
    public static void main(String args[]) {
        Phone obj = new Smart_Phone(); // obj Smart_Phone ka banta hai
        obj.name(); // Overridden, Smart_Phone Ka Print Hoga
        obj.PYear();
        // obj.LYear(); // Error Aayega Kyuki Reference Phone Ka Hai

    }
}

/*
 * Phone obj = new Smart_Phone()
 * 
 * Isme Phone Ke Jo Method Pas Hai Wo Method Include Hoga.
 * Lekin Agar same method Smart_Phone me hai to Override Ho Jayega.
 * 
 * Smart_Phone ke pas jo method hai wo accessible nhi hoga.
 * But, Phone ke method ko override kardega
 * 
 */