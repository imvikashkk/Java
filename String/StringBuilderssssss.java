import java.util.*;

public class StringBuilderssssss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String vk = sc.nextLine();
        StringBuilder sb = new StringBuilder(vk);
        System.out.println(sb);
        int idx = sc.nextInt();
        char ch = sc.next().charAt(0);
        sb.setCharAt(idx, ch);
        System.out.println(sb);
        sb.insert(0, 'J');
        System.out.println(sb);
        sc.close();
    }
}
