public class testq{
    public static void main(String args[]){
        String str = "Bhoomi";
        String[] arr = new String[3];
        arr[0] = "Lak";
        arr[1] = "bhoomi";
        arr[2] = "Shiv";

        boolean flag = false;
        for(String s : arr){
            if(s.equals(str)){
                flag = true;
                System.out.println(flag);
            }
        }
        if(!flag){
            throw new IllegalArgumentException("Lol");
        }
    }
}