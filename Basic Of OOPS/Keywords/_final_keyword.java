/****************final_keyword***************
 * final is a keyword which provides restriction in java we can use final in
 * three ways.
 * 
 * 1. final variable : Once we declare a variable as a final we can't perform
 *                     reasignment. it is like a constant variable.
 *    Syntax eg. :    final int A =10; 
 * 
 * 2. final method : whenever we declare a method as a final it cannot be overridden
 *                   to our extended class.
 *    Synax eg. : final void m1(){
 *                       // statements & properties
 *                 }
 * 
 * 3. final class : whenever we declare a class as final it cannot be extended or inherited.
 *    Syntax eg. : final class SCCC{
 *                       // Properties
 * 
 *                 }
 */

// public class _final_keyword {
//     public static void main(String args[]){

//  /************* final variable **************/
//             // final int A = 10;
//             // System.out.println(A);
//             // A =20;     // Error due to final variable cannot be reasign.
//             // System.out.println(A);

//     }
// }

/**************** final method ***************/
// class personalData {
//    final  void mNumber() {
//         System.out.println("756634500");
//     }

//    final  void atmPin() {
//         System.out.println("9394");
//     }
// }

// class thief extends personalData {

// // Not Possible due to final keyword
//     // @Override
//     // void mNumber() {
//     //     System.out.println("9754159491");
//     // }

//     // @Override
//     // void atmPin() {
//     //     System.out.println("5859");
//     // }
// }

// public class _final_keyword {
//     public static void main(String args[]) {

//         thief rf = new thief();
//         rf.mNumber();
//         rf.atmPin();
//     }
// }

/**************** final class ***************/

final class Test {
    void mt() {
        System.out.println("Vikash Kumar Khunte");
    }
}

public class _final_keyword extends Test { // Error cannot be inherited
    public static void main(String args[]) {
        _final_keyword rf = new _final_keyword();
        rf.mt();
    }
}
