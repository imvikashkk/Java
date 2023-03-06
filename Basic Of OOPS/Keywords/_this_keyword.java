/****************************************************************************
 * this keyword refers to the current object inside a method or constructor.
 ****************************************************************************/

// public class _this_keyword {

// // void show() {
// // System.out.println(this);
// // }

// public static void main(String arg[]) {
// _this_keyword ref = new _this_keyword(); // same output
// _this_keyword ref2 = new _this_keyword(); // same output
// // System.out.println(ref);
// // ref.show(); // same output

// }
// }

/********************************************************************************
 * Whenever the name o instance and local variable both are same then ourruntime
 * environment JVM gets confused that which one is local variable & which one is
 * instancevariable, to avoid this problem we should use this keyword.
 ********************************************************************************/

// public class _this_keyword {
// int a; // instance variable

// _this_keyword(int a) { // constructor with local variable parameter
// this.a = a;
// }

// public static void main(String arg[]) {
// _this_keyword ref = new _this_keyword(10); // same output
// _this_keyword ref2 = new _this_keyword(20); // same output

// System.out.println(ref.a);
// System.out.println(ref2.a);

// }
// }

/*************************************************************************************
 * It is also used when we want to cal the default constructor of its own
 * class.
 * It is also called parameterized constructor of its own class.when we pass
 * value through this(value) keyword.
 ***********************************************************************************/

// public class _this_keyword {
// _this_keyword() {
// System.out.println("Empty");
// }
// _this_keyword(int x) {
// this();
// System.out.println(x);
// }
// _this_keyword(int a, int b) {
// this(a + b);
// System.out.println(a + " " + b);
// }
// public static void main(String arg[]) {
// _this_keyword ref = new _this_keyword(10, 20); // same output
// }
// }

// // Empty
// // 30
// // 10 20
