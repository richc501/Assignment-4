package SportsStatistics;
public class SportsStatistics {
	private String playerName, playerTeam;
	private int playerNumber, numberOfPlayers, gamesWon, gamesLost;
	public SportsStatistics()
	{
		playerTeam="No team";
		playerName="No name";
		playerNumber=0;
		numberOfPlayers=0;
	}
	public SportsStatistics(String playerTeam, String playerName, int playerNumber, int numberOfPlayers, int gamesWon, int gamesLost)
	{
		super();
		this.playerTeam=playerTeam;
		this.playerName=playerName;
		this.playerNumber=playerNumber;
		this.numberOfPlayers=numberOfPlayers;
		this.gamesWon=gamesWon;
		this.gamesLost=gamesLost;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	public int getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	public int getGamesLost() {
		return gamesLost;
	}
	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}
	@Override
	public String toString() {
		return "SportsStatistics [playerName=" + playerName + ", playerTeam="
				+ playerTeam + ", playerNumber=" + playerNumber
				+ ", numberOfPlayers=" + numberOfPlayers + "]";
	}
}
