package ComparatorExample;

import java.util.Arrays;

public class Ipl {
	public static void main(String[] args) {
		Team t1 = new Team("RCB", 6, 3);
		Team t2 = new Team("CSK", 2, 9);
		Team t3 = new Team("DC", 8, 2);
		Team t4 = new Team("SRH", 2, 10);

		Team[] t = { t1, t2, t3, t4 };

		System.out.println("Sorted by Rank:");
		Arrays.sort(t, new SortByRank());
		for (Team team : t)
			System.out.println(team);

		System.out.println("  ========================  ");

		System.out.println("Sorted by Points:");
		Arrays.sort(t, new SortByPoints());
		for (Team team : t)
			System.out.println(team);
	}
}
