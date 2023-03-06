/*
 * Why Multiple Inheritance is not Support in java ?
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 
 * :- To reduce the complexity and simplify the property of two or more super classes 
 * that have sae method , java compiler can't  decide which class method should be inherit.
 * Then there might be a chance of memory dublication i.e. a reason java support multiple
 * inheritance through class.
 * 
 * Ex :-
 * 
 * class a{
 *      void m1(){
 *          //Statements
 *      }
 * }
 * class b{
 *      void m1(){
 *          // Statements
 *      }
 * }
 * 
 * class c extends a,b{
 *      // Confusion Ho Jayega Compiler Ko
 * 
 * }
 * 
 * 
 * --------------------------------------------------------
 * | NOTE : Multiple Inheritance is possible in interface |
 * --------------------------------------------------------
 * 
 * 
 * 
 *  Go to 07_Abstraction/Interface/multiple_inheritance.java
 * 
 */

public class _03_Multiple_Inhertance {

}
