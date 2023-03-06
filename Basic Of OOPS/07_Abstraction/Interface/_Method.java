/*********************************
 * _METHOD_************************************
 * Interface Method are by default : public + abstract.
 * Interface Method must be overriden inside the implementing class.
 * 
 */

interface client {
    void webdesign(); // public + abstract

    void webdevelope(); // public + abstract
}

abstract class RajTech implements client {
    @Override
    public void webdesign() {
        System.out.println("Green, Top menu, three");
    }
}

class KhuntesLogi extends RajTech {
    @Override
    public void webdevelope() {
        System.out.println("HTML, CSS, JAVASCRIPT");
    }
}

public class _Method {
    public static void main(String atgs[]) {
        KhuntesLogi rf = new KhuntesLogi();
        rf.webdesign();
        rf.webdevelope();
    }
}
