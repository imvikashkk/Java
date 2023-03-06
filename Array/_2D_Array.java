import java.util.*;

public class _2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size and colomn size : ");
        int row = sc.nextInt();
        int cols = sc.nextInt();

        /* Dynamic Array */
        int[][] arr = new int[row][cols];
        // int arr[][] = new int[row][cols];
        // int [][]arr = new int[row][cols];

        /* Static Array */
        /*
         * // Approach 01
         * String[][] subjects = {
         * { "Data Structures & Algorithms",
         * "Programming & Logic",
         * "Software Engineering",
         * "Theory of Computation" }, // row 1
         * 
         * { "Thermodynamics",
         * "Metallurgy",
         * "Machine Drawing",
         * "Fluid Mechanics" }, // row2
         * 
         * { "Signals and Systems",
         * "Digital Electronics",
         * "Power Electronics" } // row3
         * };
         * 
         * 
         * 
         */

        System.out.println("Enter the elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Elements are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the searching element : ");
        int key = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Your Elemenet Is Found At Index " + i + " " + j);
                    System.exit(1); // Terminate JVM
                }
            }
        }
        sc.close();
    }
}

/*
 * // The line below will throw an error, as the first
 * // dimension(no. of rows) is not specified
 * int[][] arr = new int[][3];
 * 
 * // The line below will execute without any error, as
 * // the first dimension(no. of rows) is specified
 * int[][] arr = new int[2][];
 * 
 */