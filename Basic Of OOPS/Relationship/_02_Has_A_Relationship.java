/***************************************
 * Has-A relationship: Whenever an instance of one class is used in another
 * class,
 * it is called HAS-A relationship.
 * 
 * These relationships are mainly based on the usage .This determines whether a
 * certain class HAS-A certain thing. This relationship helps to reduce
 * duplication of code as well as bugs.
 * 
 * Association
 * // \\
 * aggregation Composition
 * (Weak) (Strong)
 * 
 * 
 * Aggregation : Both object can exist independently. // Object from two
 * different class
 * 
 * Composition : Both object cannot exist independly. one object cannot exist
 * without
 * another object. // Object from two different class
 * 
 */

// // Aggregation
// class Address {
// String city;
// String state;
// String country;
// int pincode;

// Address(String city, String state, String country, int pincode) {
// this.city = city;
// this.state = state;
// this.country = country;
// this.pincode = pincode;
// }
// }

// class student {
// String st_name;
// int rollno;
// Address adrs;

// student(String st_name, int rollno, Address adrs) {
// this.st_name = st_name;
// this.rollno = rollno;
// this.adrs = adrs;
// }

// }

// public class _02_Has_A_Relationship {
// public static void main(String args[]) {
// Address ad1 = new Address("Ranchi", "Jharkhand", "India", 834006);
// Address ad2 = new Address("Bilaspur", "Chhattisgarh", "India", 495001);

// student st1 = new student("Vikash Kumar", 50, ad1);
// student st2 = new student("Rahul Ag", 28, ad2);

// System.out.println(
// "Student Name : " + st1.st_name +
// "\nRollNo : " + st1.rollno +
// "\nCity : " + st1.adrs.city +
// "\nState : " + st1.adrs.state +
// "\nCountry : " + st1.adrs.country +
// "\nPin Code : " + st1.adrs.pincode);

// }
// }

// Composistion
class Engine {
    int horsepower;
    String type;

    Engine(int horsepower, String type) {
        this.type = type;
        this.horsepower = horsepower;
    }
}

class car {
    String CarName;
    Engine eng;

    car(String CarName, Engine eng) {
        this.CarName = CarName;
        this.eng = eng;
    }

    void show() {
        System.out.println(
                "Car Name : " + CarName +
                        "\nHorse Power : " + eng.horsepower +
                        "\nType : " + eng.type);
    }

}

public class _02_Has_A_Relationship {
    public static void main(String args[]) {
        Engine eg = new Engine(1000, "Petrol");

        car cr = new car("Thar", eg);

        cr.show();
    }

}
