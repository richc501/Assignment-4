package ReadingMaterials;

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
