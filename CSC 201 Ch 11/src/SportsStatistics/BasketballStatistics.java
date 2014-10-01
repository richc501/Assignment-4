package SportsStatistics;

public class BasketballStatistics extends SportsStatistics{
	private int numberOfRebounds, numberOfSteals, numberOfShots;
	public BasketballStatistics()
	{
		
	}
	public BasketballStatistics(String playerTeam, String playerName,
			int playerNumber, int numberOfPlayers, int gamesWon, int gamesLost, int numberOfRebounds, int numberOfSteals, int numberOfShots) {
		super(playerTeam, playerName, playerNumber, numberOfPlayers, gamesWon,
				gamesLost);
		this.numberOfRebounds=numberOfRebounds;
		this.numberOfSteals=numberOfSteals;
		this.numberOfShots=numberOfShots;
		
	}

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
				+ numberOfShots + "]";
	}
}
