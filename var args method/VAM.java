class A {
    void add(int... a) {// int ... a => int[] a like a one dimesion array, only three times(.)
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }

        System.out.println("Sum of number is : " + sum);

    }
}

public class VAM {
    public static void main(String arg[]) {
        A rf = new A();

        rf.add();
        rf.add(10);
        rf.add(10, 20, 30);
        rf.add(78, -52);
        rf.add(10, 20, 30, 40, 50, 60);

    }
}
