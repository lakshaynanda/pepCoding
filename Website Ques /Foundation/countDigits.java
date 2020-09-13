import java.util.*;

public class countDigits {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}