package SportsStatistics;

public class SoccerStatistics extends SportsStatistics {
	private int gamesTied, numberOfGoals;
	public SoccerStatistics(String playerTeam, String playerName,
			int playerNumber, int gamesWon, int gamesLost, int gamesTied, int numberOfGoals)
	{//Constructor
		super(playerTeam, playerName, playerNumber, gamesWon,
				gamesLost);
		this.gamesTied=gamesTied;
		this.numberOfGoals=numberOfGoals;
	}
	//getters and setters
	public int getGamesTied() {
		return gamesTied;
	}

	public void setGamesTied(int gamesTied) {
		this.gamesTied = gamesTied;
	}

	public int getNumberOfGoals() {
		return numberOfGoals;
	}

	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}
	@Override
	public String toString() {
		return "SoccerStatistics [gamesTied=" + gamesTied + ", numberOfGoals="
				+ numberOfGoals + ", getPlayerName()=" + getPlayerName()
				+ ", getPlayerTeam()=" + getPlayerTeam()
				+ "\n, getPlayerNumber()=" + getPlayerNumber()
				+ ", getGamesWon()=" + getGamesWon() + ", getGamesLost()="
				+ getGamesLost() + "]";
	}

	
	
}
