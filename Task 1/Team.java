import java.util.List;

public class Team{
	private String teamname;
	private int ranking;
	private List<String> playernames;

	 public Team(String name, int ranking, List<String> playerNames) {
        this.teamname = name;
        this.ranking = ranking;
        this.playernames = playerNames;

	}

	public String getName() {
        return teamname;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}