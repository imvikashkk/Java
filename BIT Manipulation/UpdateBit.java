public class UpdateBit {
    public static void main(String args[]) {

        int num = 5; // 0101
        int pos = 3;
        int bitMask = 1 << (pos - 1);
        int notBitMask = ~bitMask;

        if ((num & bitMask) == 0) {
            // then that positional Bit is Zero
            num = num | bitMask;

        } else {
            num = num & notBitMask;
        }
        System.out.println(num);

    }
}
