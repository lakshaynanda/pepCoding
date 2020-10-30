import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Ballot {
	private static ArrayList<Party> parties = new ArrayList<>();
	private static int counter = 0;
	private Candidate[] votes;
	private int ID;

	public Ballot() {
		this.votes = new Candidate[3];
		this.ID = counter;
		counter++;
	}

	public static void addParty(Party p) {
		if (!parties.contains(p)) {
			parties.add(p);
		}
	}

	public static ArrayList<Candidate> getCandidates(String office) {
		ArrayList<Candidate> candidates = new ArrayList<>();

		for (int i = 0; i < parties.size(); i++) {
			try {
				candidates.add(parties.get(i).getCandidate(office));
			} catch (NoSuchElementException e) {
				continue;
			}
		}
		return candidates;
	}

	public Candidate getVote(String office) {
		Candidate candidate = null;
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] == null) {
				continue;
			}
			if (votes[i].getOffice().equals(office)) {
				candidate = votes[i];
			}
		}
		return candidate;

	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}

		if (!(o instanceof Ballot)) {
			return false;
		}

		Ballot b = (Ballot) o;

		return Integer.compare(ID, b.ID) == 0;

	}

    public void vote(Candidate c) {
		String office = c.getOffice();
        if(office.equals("President")){
            votes[0]=c;
        } else if(office.equals("Vice President")){
            votes[1]=c;
        } else{
            votes[2]=c;
        }
	}
    
}