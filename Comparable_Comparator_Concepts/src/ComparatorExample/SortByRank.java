package ComparatorExample;

import java.util.Comparator;

public class SortByRank implements Comparator<Team> {
	@Override
	public int compare(Team t1, Team t2) {
		return t1.rank - t2.rank; 
	}
}