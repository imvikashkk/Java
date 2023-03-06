/*********************
 * Extending_Interface*****************
 * if we want to reuse the code of one interface to another interface
 * then we can extends the interface like inheritance.
 */

interface Gill {
    void add();
}

interface Raj extends Gill {
    void sub();
}

public class _Extending implements Raj {
    @Override
    public void add() {
        System.out.println("Gill/Raj Ka add()");
    }

    @Override
    public void sub() {
        System.out.println("Raj ka sub()");
    }

    public static void main(String args[]) {
        _Extending rf = new _Extending();
        rf.add();
        rf.sub();
    }
}
