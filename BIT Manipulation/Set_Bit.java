public class Set_Bit {
    // SetBit is that positional BIT With 1

    public static void main(String args[]) {
        int num = 5;
        int pos = 0;
        int bitMask = 1 << (pos - 1);

        num = bitMask | num;
        System.out.println(num);

    }
}
