import java.util.*;

public class primeFact{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int div = 2;div * div <= n; div++){
      while(n%div==0){
          System.out.print(div+" ");
          n = n / div;
        }
      }
      if(n != 1){
      System.out.print(n+" ");
     }
  }
 }
