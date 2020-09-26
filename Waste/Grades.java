import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ComparisonMethods{
    public static long bruteForce(long n){
        /**
        * Complexity: O(N)
        */
        long sum = 0;
        long i = 1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        return sum;
    }
    public static long constantTime(long n){
        /**
        * Complexity: O(1)
        */
        long sum = n*(n+1)/2;
        return sum;
    }
    public static String compare(long n) throws RuntimeException{
        long start1 = System.currentTimeMillis();
        long val1 = bruteForce(n);
        long end1 = System.currentTimeMillis();
        
        long start2 = System.currentTimeMillis();
        long val2 = constantTime(n);
        long end2 = System.currentTimeMillis();

        long bruteForceTime = end1-start1;
        long formulaTime = end2-start2;

        String str = n + "\t" + bruteForceTime +"\t" + formulaTime +"\n";
        if(val1 != val2){
            throw new NoSuchElementException("Values are different");
        } else {
            return str;
        }  
    }
    public static void createResultsFile(File f, long[] queryNs){

        FileWriter fr = null;
        String str = new String();
        try {
            try{
                fr = new FileWriter(f);
            } catch (IOException e){
                System.out.println("Exception encountered, unable to complete method");
            }
            for(int i=0;i<queryNs.length;i++){
              str = compare(queryNs[i]);
              fr.write(str);
            }  
        } catch (IOException e) {
            System.out.println("Exception encountered while writing for value N = " + str);
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("Exception encountered while closing file");
            }
        }
    }
    public static void main(String args[]){
        System.out.print(compare(1000000000));
        // System.out.println(bruteForce(100000));
        // System.out.println(constantTime(100000));

    }
}