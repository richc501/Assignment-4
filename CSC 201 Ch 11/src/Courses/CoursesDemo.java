package Courses;

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
