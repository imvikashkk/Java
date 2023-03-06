import java.util.*;

public class rever {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String vk = sc.nextLine();

        StringBuilder sb = new StringBuilder(vk);
        System.out.print("Your Reversed String Is : ");

        for (int i = 0; i < (sb.length() / 2); i++) {
            int f = i;
            int l = sb.length() - 1 - i;
            char ft = sb.charAt(f);
            char bk = sb.charAt(l);

            System.out.println(ft + " " + bk);
            sb.setCharAt(f, bk);
            sb.setCharAt(l, ft);

        }
        System.out.println(sb);

        sc.close();
    }
}
