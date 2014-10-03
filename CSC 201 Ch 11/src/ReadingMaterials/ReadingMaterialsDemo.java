package ReadingMaterials;
//Richard Cunningham
//Problem Statement
//
//Design and implement a set of classes that define various types of reading material: 
//books, novels, magazines, technical journals, textbooks, and so on. Include data values 
//that describe various attributes of the material, such as the number of pages and the names
//of the primary characters. Include methods that are named appropriately for each class and 
//that print an appropriate message. Create a main driver class to instantiate and exercise several of the classes.
//
//Directions
//
//Consider the problem, design an algorithm (or algorithms) that would solve the problem, and then implement the algorithm in Java.
//Please insert the algorithm written in pseudocode as a comment in the beginning of your program.
//Submit the source code, along with snapshots of your running program - you can take snapshots using PrintScreen, making sure that the console window in which you run the program appears on the screen.
//Copy the snapshot in a word processing program of your choosing. If your program has different outcomes, take snapshots of each variation.
//Upload your screenshots in Blackboard using the Assignment Upload area below.
public class ReadingMaterialsDemo {

	public static void main(String[] args) {
		Books book = new Books(120, "Mark Whitaker", "Cosby: His Life and Times", 13, 5, "Bill Cosby");
		System.out.println(book);
		Novels novel = new Novels(150, "J.K. Rowling","Harry Potter",12,8,"Harry Potter",7);
		System.out.println("\n"+novel);
		Magazines mag = new Magazines(20, "Jess Cagle", "People",72);
		System.out.println("\n"+mag);
		TextBook textBook = new TextBook(800, "Ron Larson", "Calculus Of A Single Varible", 10, 10);
		System.out.println("\n"+textBook);
		TechnicalJournals journal = new TechnicalJournals(56, "Bob", "Science Stuff", 30);
		System.out.println("\n"+journal);
		ReadingMaterials read = new ReadingMaterials(20, "Fred", "Random Story");
		System.out.println("\n"+read);
	}

}
