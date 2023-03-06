
import java.util.*;

public class Half_Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int n = sc.nextInt();
        sc.close();

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Inverted_Half_Pyramid__________**\n\n");
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**_____________Half_Pyramid_____________**\n\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**_____________Half_Pyramid_Rotated_By_180_____________**\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= (n - j))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**_____________Inverted_Half_Pyramid_Rotated_By_180_____________**\n\n");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i <= (n - j))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Num_Half_Pyramid__________**\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Num_Inverted_Half_Pyramid__________**\n\n");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("**\n\n__________Floyd's_Triangle__________**\n\n");
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________0-1_Triangle__________**\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
