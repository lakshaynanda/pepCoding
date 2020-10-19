import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Party {
	private String name = new String();
	private ArrayList<Candidate> candidates = new ArrayList<>();

	public Party(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return candidates.size();
	}

	public void addCandidate(Candidate c) {
		if (!candidates.contains(c)) {
			candidates.add(c);
		} else {
			throw new IllegalArgumentException("Candidate Already Exists");
		}
	}

	public Candidate getCandidate(String office) {
		boolean flag = false;
		Candidate can = null;
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).getOffice().equals(office)) {
				flag = true;
				can = candidates.get(i);
			}
		}
		if (!flag) {
			throw new NoSuchElementException("No Candidate Found");
		}
		return can;
	}
}