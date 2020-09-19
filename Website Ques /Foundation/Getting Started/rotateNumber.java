import java.util.*;

public class rotateNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        k = k % count;
        if (k < 0) {
            k = k + count;
        }

        int div = 1;
        int mul = 1;
        for (int i = 1; i <= count; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        int rem = n % div;
        int q = n / div;
        int newnum = rem * mul + q;
        System.out.println(newnum);
    }
}