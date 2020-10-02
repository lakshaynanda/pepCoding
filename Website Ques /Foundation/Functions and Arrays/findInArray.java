import java.io.*;
import java.util.*;

public class findInArray {
    public static void find(int a[], int d) {
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        find(a, d);
        // write your code here
    }

}