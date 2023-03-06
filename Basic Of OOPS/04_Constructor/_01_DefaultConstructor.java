/*

A default constructor is created only when we don't declare any constructor in our code.
Then, by default, the compiler automatically creates a default constructor.

*/

class defaultCons {

    // After calling the this class
    /*************
     * DEFAULT CONSTRUCTOR *************
     * 
     * Here compiler automaticaly create a constructor shown as below :
     * defaultCons(){
     * 
     * }
     * No need to create a constructor
     * 
     * which is called default constructor
     */

    String car = "Mahindra Thar";

    String carName() {
        return car;
    }
}

public class _01_DefaultConstructor {
    public static void main(String arg[]) {
        defaultCons obj = new defaultCons(); // Creating the object of defaultCons class so,
                                             // call the defaultCons class then constructor will be created

        System.out.println(obj.carName());

    }
}