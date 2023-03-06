/*
 * If a constructor does not accept any parameters, it is known as a no-argument constructor.
 * 
 */

class Book {

    /*************
     * NO-ARGUEMENT CONSTRUCTOR *************
     * 
     */
    Book() {
        System.out.println("This is a no arguement Constructor");
        float price;
        String Name;
        String Autor;
    }
}

public class _02_NoArguementConstructor {

    public static void main(String args[]) {
        Book b1 = new Book(); // Creating the object of defaultCons class so,
                              // call the that class then constructor will be created.

    }
}
