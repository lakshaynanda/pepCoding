import java.util.*;

public class lcmGcd {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int on1 = num1;
        int on2 = num2;
        int rem = 0;
        int divisor = num2;
        int divident = num1;
        while (num1 % num2 != 0) {
            rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (on1 * on2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}