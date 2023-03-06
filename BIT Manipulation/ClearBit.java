// public class ClearBit {
//     // 0 in that given position
//     public static void main(String args[]) {
//         int num = 5;
//         int pos = 3;
//         int bitMask = 1 << (pos - 1);
//         num = ~num; // Complement
//         num = bitMask | num;
//         num = ~num;
//         System.out.println(num);
//     }
// }

public class ClearBit {
    public static void main(String args[]) {
        int num = 5;
        int pos = 3;
        int BitMask = 1 << (pos - 1);
        BitMask = ~BitMask;
        num = num & BitMask;

        System.out.println(num);

    }
}