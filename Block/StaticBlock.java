/*
 * Static block is such kind of block in java which gets executed at the time of loading
 * the .class file into JVM memory.
 * 
 * A.java                   _________________________
 *   |                     |                         |
 *   v                     |                         v
 *                         |               _______________________
 * javac // Java Compiler  |              |   Class Loader        |
 *   |                     |              |-----------------------|
 *   v                     |              |  Byte code verifier   |
 *                         |              |-----------------------|
 * A.class                 |              |  Execution Engine     |
 *    |                    |              |_______________________|
 *    |____________________|                        JVM
 * 
 * 
 *      -> Static Block execute between classFileCreation and ClassLoader(JVM)
 *      -> Static Block execute before Instance Block
 */

public class StaticBlock {
    static {
        System.out.println("Static Block ");
    }
    {
        System.out.println("Instance Variable ");
    }

    public static void main(String arg[]) {
        StaticBlock A = new StaticBlock();
    }
}
