import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Benchmarker{
  
  
  public static String compare(long n) throws RuntimeException{
    String str = new String();
    long start1 = System.currentTimeMillis();
    long val1 = ComparisonMethods.bruteForce(n);
    long end1 = System.currentTimeMillis();
    
    long start2 = System.currentTimeMillis();
    long val2 = ComparisonMethods.constantTime(n);
    long end2 = System.currentTimeMillis();

    long bruteForceTime = end1-start1;
    long formulaTime = end2-start2;

    str = n + "\t" + bruteForceTime +"\t" + formulaTime +"\n";
    if(val1 != val2) {
        str = "Values don't match";
        throw new NoSuchElementException(str);
    }
    return str;
}

    public static void createResultsFile(File f, long[] queryNs){

      FileWriter fr = null;
      String str = new String();
      try {
          fr = new FileWriter(f);
      } catch (IOException e){
          System.out.println("Exception encountered, unable to complete method");
      }
      try{
          for(int i=0;i<queryNs.length;i++){
              try{
                  str = compare(queryNs[i]);
              } catch(NoSuchElementException e){
                  e.printStackTrace();
              }
              fr.write(str);
          }
      }catch (IOException e){
              System.out.println("Exception encountered while writing for value N = " + str);
          }
      try {
          fr.close();
      } catch (IOException e) {
          System.out.println("Exception encountered while closing file");
      }
  }
    
    public static void main(String args[]){
        long[] queryNs = new long[5];
        queryNs[0]=100000;
        queryNs[1]=1000000;
        queryNs[2]=10000000;
        queryNs[3]=100000000;
        queryNs[4]=1000000000;

        File f = new File("/Users/Shivam/source.txt");
        createResultsFile(f,queryNs);
    }
}