package SportsStatistics;

public class SportsDemo {

	public static void main(String[] args) {
		SportsStatistics stats = new SportsStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 12, 7, 2);
		System.out.println(stats);
		FootballStatistics footballStats = new FootballStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 12, 7, 2, 7);
		System.out.println(footballStats);
		BasketballStatistics basketballStats = new BasketballStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 12, 7, 2, 13, 5, 25);
		System.out.println(basketballStats);
		SoccerStatistics soccerStats = new SoccerStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 12, 7, 2, 4, 1);
		System.out.println(soccerStats);
	}

}
