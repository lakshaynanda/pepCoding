import java.util.*;
  
  public class decimaltoAnybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int rv = 0;
       int p = 1;
       while(n>0){
           int rem = n % b;
           n = n / b;
           rv += rem*p;
           p = p * 10;
       }
       return rv;
   }
  }