package Courses;
//Richard Cunningham
//Problem Statement
//
//Design and implement a set of classes that define various courses in your curriculum. Include information about each course such as the title, number, description, and department that teaches the course. Consider the categories of classes that constitutes your curriculum when designing your inheritance structure. Create a main driver class to instantiate and exercise several of the classes. 
//Directions
//
//Consider the problem, design an algorithm (or algorithms) that would solve the problem, and then implement the algorithm in Java.
//Please insert the algorithm written in pseudocode as a comment in the beginning of your program.
//Submit the source code, along with snapshots of your running program - you can take snapshots using PrintScreen, making sure that the console window in which you run the program appears on the screen.
//Copy the snapshot in a word processing program of your choosing. If your program has different outcomes, take snapshots of each variation.
//Upload your screenshots in Blackboard using the Assignment Upload area below.
public class CoursesDemo {
	public static void main(String[] args)
	{
		Courses random = new Courses("Test", "Test", 1337, "Link");
		
		Chemistry chem = new Chemistry("Chemistry", "Science", 101, "U do Science stuff", true);
		
		ComputerScience CS = new ComputerScience("Computer Science", "Programming", 201,"U Code stuff", "Java","Eclipse");
		
		Economics Eco = new Economics("Economics", "Social Science", 201, "U learn how Economy works", "Macro");
		
		System.out.println("\n"+random);
		
		System.out.println("\n"+chem);
		
		System.out.println("\n"+CS);
		
		System.out.println("\n"+Eco);
	}
}
