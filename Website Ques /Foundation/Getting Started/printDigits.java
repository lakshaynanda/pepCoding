import java.util.*;

public class printDigits {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int div = (int) Math.pow(10, count - 1);
        while (div != 0) {
            int rem = n / div;
            System.out.println(rem);
            n = n % div;
            div = div / 10;
        }
    }
}