import java.util.*;

public class _1D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n = sc.nextInt();

        /*
         * Static Array
         *
         * int num[3] = {10,20,30}; // 10 20 30
         * int num1[3] = {10,20}; // 10 20 0
         * int num2[3] = {[2]=5, [0]= 6, [1]= 8}; // 6 8 5
         * String[] suit = new String[] {"Japan","India","Austria","Dubai" };
         * List suit = Arrays.asList("Japan","India","Austria","Dubai");
         * 
         */

        /* Dynamic Array */
        // float[] arr = new float[n];
        // float arr[] = new float[n];

        float[] arr = new float[n];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        System.out.print("Your Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}