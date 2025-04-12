package ComparatorExample;

import java.util.Comparator;

public class SortByPoints implements Comparator<Team> {
	@Override
	public int compare(Team t1, Team t2) {
		return t2.points - t1.points; // Descending order of points
	}
}
