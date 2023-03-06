public class Get_Bit {
    public static void main(String args[]) {
        int num = 5;
        int pos = 2; // ......8...4 3 2 1
        int bitMask = 1 << (pos - 1);

        if ((bitMask & num) == 0) {
            System.out.println("BIT is Zero.");
        } else {
            System.out.println("BIT is One.");
        }

    }
}