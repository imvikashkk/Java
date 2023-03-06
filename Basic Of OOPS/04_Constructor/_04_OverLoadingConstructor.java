/*
 * Constructor overloading is a concept of having more than one constructor with different
 * parameters list, in such a way so that each constructor performs a different task.
 * 
 */

class person {

    person() {
        System.out.println("Constructor_OverLoading with no-arguement");
    }

    person(int ag) {
        System.out.println("Person's Age is " + ag);
    }

    person(String nm) {
        System.out.println("Person's Name is " + nm);
    }

    person(String nm, int ag) {
        System.out.println("Person's : \nName : " + nm + "\nAge : " + ag);
    }

    person(String nm, int ag, char sex) {
        System.out.println("Person's : \nName : " + nm + "\nAge : " + ag + "\nSex : " + sex);
    }

}

public class _04_OverLoadingConstructor {
    public static void main(String args[]) {
        person _empty = new person();
        person _name = new person("Vikash");
        person _age = new person(20);
        person _name_age = new person("Vikash", 20);
        person _name_age_sex = new person("Vikash", 20, 'M');
    }
}
