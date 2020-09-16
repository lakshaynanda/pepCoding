import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cst = n;
        int csp = 0;
        // write ur code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= csp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= cst; k++) {
                System.out.print("*\t");
            }
            System.out.println();
            cst--;
            csp++;
        }
    }
}