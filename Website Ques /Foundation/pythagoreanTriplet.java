import java.util.*;

public class pythagoreanTriplet {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (a == max) {
            boolean flag = (b * b + c * c == a * a);
            System.out.println(flag);
        } else if (b == max) {
            boolean flag = (a * a + c * c == b * b);
            System.out.println(flag);
        } else {
            boolean flag = (b * b + a * a == c * c);
            System.out.println(flag);
        }
    }
}