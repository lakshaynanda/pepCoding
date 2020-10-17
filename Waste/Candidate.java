public class Candidate{
    protected static final String[] OFFICE = new String[] {"President","Vice President", "Secretary"};

    private String name;
    private String office;

    public Candidate(String name, String office){
        this.name = name;
        boolean flag = false;
        for(String s : OFFICE){
            if(s.equals(office)){
                flag = true;
                this.office = office;
            }
        }
        if(!flag){
            throw new IllegalArgumentException("Office chosen is not in the list");
        }
    }
    public String getName(){
        return name;
    }

    public String getOffice(){
        return office;
    }

    public String toString(){
        String str = getName()+" ("+getOffice()+")";
        return str;
    }
    public static void main(String args[]){
        Candidate ob1 = new Candidate("Lakshay", "LOL");
        System.out.println(ob1.toString());
    }
}