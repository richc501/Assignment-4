package SportsStatistics;

public class FootballStatistics extends SportsStatistics {
	private int numberOfTouchDowns;
	public FootballStatistics(String playerTeam, String playerName,
			int playerNumber, int gamesWon, int gamesLost, int numberOfTouchDowns) 
	{//Constructor
		super(playerTeam, playerName, playerNumber, gamesWon, gamesLost);
		this.numberOfTouchDowns=numberOfTouchDowns;
	}
	//getters and setters
	public int getNumberOfTouchDowns() {
		return numberOfTouchDowns;
	}
	public void setNumberOfTouchDowns(int numberOfTouchDowns) {
		this.numberOfTouchDowns = numberOfTouchDowns;
	}
	@Override
	public String toString() {
		return "FootballStatistics [numberOfTouchDowns=" + numberOfTouchDowns
				+ ", getPlayerName()=" + getPlayerName() + ", getPlayerTeam()="
				+ getPlayerTeam() + ", getPlayerNumber()=" + getPlayerNumber()
				+ "\n, getGamesWon()=" + getGamesWon() + ", getGamesLost()="
				+ getGamesLost() + "]";
	}
	

}
