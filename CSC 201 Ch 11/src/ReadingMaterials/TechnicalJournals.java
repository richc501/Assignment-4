package ReadingMaterials;

public class TechnicalJournals extends ReadingMaterials {
	private int numberOfEnteries;
	public TechnicalJournals(int numberOfPages, String author, String title, int numberOfEnteries)
	{//Constructor
		super(numberOfPages, author, title);
		this.numberOfEnteries=numberOfEnteries;
	}
	//getters and setters
	public int getNumberOfEnteries() {
		return numberOfEnteries;
	}
	public void setNumberOfEnteries(int numberOfEnteries) {
		this.numberOfEnteries = numberOfEnteries;
	}
	@Override
	public String toString() {
		return "TechnicalJournals [numberOfEnteries=" + numberOfEnteries
				+ ", getNumberOfPages()=" + getNumberOfPages()
				+ ", getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle()
				+ "]";
	}
}
