import java.util.*;

public class Advance_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();
        sc.close();

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Butterfly_Pattern__________**\n\n");
        for (int i = 1; i <= ((n / 2) + 1); i++) {
            for (int j = 0; j <= n; j++) {
                if (j < i || j >= (n - i + 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = ((n / 2)); i >= 1; i--) {
            for (int j = 0; j <= n; j++) {
                if (j < i || j >= (n - i + 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Solid_Rhombus__________**\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n); j++) {
                if ((j <= (n - i)) || (j > (2 * n - i)))
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Number_Pyramid__________**\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (((n - i) >= j))
                    System.out.print("  ");
                else if (i < 10)
                    System.out.print("0" + i + "  ");
                else
                    System.out.print(i + "  ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Palindromic_Num_Pyramid__________**\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (((n - i) >= j || (n + i) <= j)) {
                    System.out.print("  ");
                } else {
                    if (j >= n)
                        System.out.print((j - n + 1) + " ");
                    else
                        System.out.print((n - j + 1) + " ");
                }
            }
            System.out.println();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\n**__________Diamond_Pattern__________**\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (((n - i) >= j || (n + i) <= j)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (((n - i) >= j || (n + i) <= j)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
