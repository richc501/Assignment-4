package ReadingMaterials;

public class ReadingMaterials {
	private int numberOfPages;
	private String author, title;
	
	public ReadingMaterials(int numberOfPages, String author, String title){
		super();
		this.numberOfPages=numberOfPages;
		this.author=author;
		this.title=title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString()
	{
		return "numberOfPages= "+numberOfPages+" author= "+author+ " title= "+title;
	}
}
