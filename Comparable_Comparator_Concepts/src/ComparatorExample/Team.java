package ComparatorExample;

public class Team {
	String name;
	int points;
	int rank;

	public Team(String name, int points, int rank) {
		this.name = name;
		this.points = points;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", points=" + points + ", rank=" + rank + "]";
	}
}
