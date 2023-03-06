/**************************
 * Interface_Variable***********************
 * Interface Variable are by default : public + static + final
 */

interface customerVikash {
    int amt = 10; // public + static + final;

    void purchase(); // public + abstract
}

class sellerSanju implements customerVikash {
    @Override
    public void purchase() {
        // amt = 7; final, so cannot Override
        System.out.println("Raj needs " + amt + "Kg rice.");
    }

}

public class _Variable {
    public static void main(String args[]) {
        // customerVikash cV = new sellerSanju();
        // cV.purchase();
        System.out.println(customerVikash.amt);
    }

}
