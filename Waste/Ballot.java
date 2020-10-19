import java.util.ArrayList;

public class Ballot{
    private ArrayList<Party> parties = new ArrayList<>();
    private int counter = 0;

    private int[] votes;
    private int ID;

    Candidate useClass = new Candidate();

    public Ballot(){
        this.votes = new int[useClass.OFFICE.length];
        this.ID = counter;
        counter++;
    }

    public static void addParty(Party p){
        boolean contain = parties.contains(p);
        if(!contain){
            parties.add(p);
        }
    }
    public static ArrayList<Candidate> getCandidates(String office){
        ArrayList<Candidate> candidates = new ArrayList<>();

    }

    public static void main(String args[]){

    }
}