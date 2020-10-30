import java.util.ArrayList;

public class BallotBox {
	private ArrayList<Ballot> ballots = new ArrayList<Ballot>();

	public BallotBox() {
		this.ballots = new ArrayList<>();
	}

	public int getNumBallots() {
		ArrayList<Ballot> temp = new ArrayList<>();
		for (Ballot b : ballots) {
			if (!temp.contains(b)) {
				temp.add(b);
			}
		}
		return temp.size();
	}

	public void submit(Ballot b) {
		if (!ballots.contains(b)) {
			ballots.add(b);
		}
	}

	public Candidate getWinner(String office) {

		ArrayList<Candidate> candidates = Ballot.getCandidates(office);
		int[] votes = new int[candidates.size()];

		for (int i=0; i<ballots.size(); i++) {
			Candidate c = ballots.get(i).getVote(office);
			if (c != null) {
				votes[candidates.indexOf(c)]++;
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > max) {
				max = i;
			}
		}
		return candidates.get(max);
	}
}