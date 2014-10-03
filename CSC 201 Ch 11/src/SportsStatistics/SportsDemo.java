package SportsStatistics;
//Richard Cunningham
//Problem Statement
//
//Design and implement a set of classes that keeps track of various sports statistics. 
//Have each low-level class represent a specific sport. 
//Tailor the services of the classes to the sport in question, 
//and move common attributes to the higher-level classes as appropriate. 
//Create a main driver class to instantiate and exercise several of the classes.
//Directions
//
//Consider the problem, design an algorithm (or algorithms) that would solve the problem, and then implement the algorithm in Java.
//Please insert the algorithm written in pseudocode as a comment in the beginning of your program.
//Submit the source code, along with snapshots of your running program - you can take snapshots using PrintScreen, making sure that the console window in which you run the program appears on the screen.
//Copy the snapshot in a word processing program of your choosing. If your program has different outcomes, take snapshots of each variation.
//Upload your screenshots in Blackboard using the Assignment Upload area below.
public class SportsDemo {

	public static void main(String[] args) {
		SportsStatistics stats = new SportsStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 7, 2);
		System.out.println(stats);
		FootballStatistics footballStats = new FootballStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 7, 2, 7);
		System.out.println("\n"+footballStats);
		BasketballStatistics basketballStats = new BasketballStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 7, 2, 13, 5, 25);
		System.out.println("\n"+basketballStats);
		SoccerStatistics soccerStats = new SoccerStatistics("TEST", "PERSON", ((int)Math.random()*10+1), 7, 2, 4, 1);
		System.out.println("\n"+soccerStats);
	}

}
