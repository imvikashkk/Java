/*
 * In simple/single inheritance there exist only one single super class and only one sub class.
 * 
 */

// class Employee {
//     float sal = 70000;
//     int a = 10;
// }

// public class _01_SimpleInheritance extends Employee {
//     int a = 50;
//     float bonus = 30000;

//     public static void main(String arg[]) {
//         _01_SimpleInheritance dv = new _01_SimpleInheritance();
//         System.out.println("Employee Salary: " + dv.sal);
//         System.out.println("Employee Bonus: " + dv.bonus);
//         System.out.println("Subclass a:" + dv.a);
//     }
// }

class student {
    int rollno, marks;
    String name;

    void input() {
        System.out.println("Enter the roll name & marks : ");
    }
}

public class _01_SimpleInheritance extends student {
    void display() {
        rollno = 50;
        name = "Vikash Kumar";
        marks = 33;
        System.out.println(rollno + " " + name + " " + marks);
    }

    public static void main(String args[]) {
        _01_SimpleInheritance ref = new _01_SimpleInheritance();
        ref.input();
        ref.display();
    }
}