import java.util.*;

public class pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");

            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*\t");
            }
            nst++;
            nsp--;
            System.out.println();
        }
        // write ur code here

    }
}