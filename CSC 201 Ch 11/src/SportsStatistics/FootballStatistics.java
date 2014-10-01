package SportsStatistics;

public class FootballStatistics extends SportsStatistics {
	private int numberOfTouchDowns;
	public FootballStatistics()
	{
		
	}
	public FootballStatistics(String playerTeam, String playerName,
			int playerNumber, int numberOfPlayers, int gamesWon, int gamesLost, int numberOfTouchDowns) {
		super(playerTeam, playerName, playerNumber, numberOfPlayers, gamesWon, gamesLost);
		this.numberOfTouchDowns=numberOfTouchDowns;
	}
	public int getNumberOfTouchDowns() {
		return numberOfTouchDowns;
	}
	public void setNumberOfTouchDowns(int numberOfTouchDowns) {
		this.numberOfTouchDowns = numberOfTouchDowns;
	}
	@Override
	public String toString() {
		return "FootballStatistics [numberOfTouchDowns=" + numberOfTouchDowns
				+ "]";
	}

}
