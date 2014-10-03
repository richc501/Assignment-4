package SportsStatistics;

public class BasketballStatistics extends SportsStatistics{
	private int numberOfRebounds, numberOfSteals, numberOfShots;
	public BasketballStatistics(String playerTeam, String playerName,
			int playerNumber, int gamesWon, int gamesLost, int numberOfRebounds, int numberOfSteals, int numberOfShots) 
	{//Constructor
		super(playerTeam, playerName, playerNumber, gamesWon,
				gamesLost);
		this.numberOfRebounds=numberOfRebounds;
		this.numberOfSteals=numberOfSteals;
		this.numberOfShots=numberOfShots;
		
	}
	//getters and setters
	public int getNumberOfRebounds() {
		return numberOfRebounds;
	}

	public void setNumberOfRebounds(int numberOfRebounds) {
		this.numberOfRebounds = numberOfRebounds;
	}

	public int getNumberOfSteals() {
		return numberOfSteals;
	}

	public void setNumberOfSteals(int numberOfSteals) {
		this.numberOfSteals = numberOfSteals;
	}

	public int getNumberOfShots() {
		return numberOfShots;
	}

	public void setNumberOfShots(int numberOfShots) {
		this.numberOfShots = numberOfShots;
	}
	@Override
	public String toString() {
		return "BasketballStatistics [numberOfRebounds=" + numberOfRebounds
				+ ", numberOfSteals=" + numberOfSteals + ", numberOfShots="
				+ numberOfShots + ", getPlayerName()=" + getPlayerName()
				+ "\n, getPlayerTeam()=" + getPlayerTeam()
				+ ", getPlayerNumber()=" + getPlayerNumber()
				+ ", getGamesWon()=" + getGamesWon() + ", getGamesLost()="
				+ getGamesLost() + "]";
	}

	
}
