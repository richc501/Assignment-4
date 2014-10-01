package SportsStatistics;

public class SoccerStatistics extends SportsStatistics {
	private int gamesTied, numberOfGoals;
	public SoccerStatistics()
	{
		
	}
	public SoccerStatistics(String playerTeam, String playerName,
			int playerNumber, int numberOfPlayers, int gamesWon, int gamesLost, int gamesTied, int numberOfGoals) {
		super(playerTeam, playerName, playerNumber, numberOfPlayers, gamesWon,
				gamesLost);
		this.gamesTied=gamesTied;
		this.numberOfGoals=numberOfGoals;
	}

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
				+ numberOfGoals + "]";
	}
	
}
