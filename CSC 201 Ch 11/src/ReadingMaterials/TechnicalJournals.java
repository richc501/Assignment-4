package ReadingMaterials;

public class TechnicalJournals extends ReadingMaterials {
	private int numberOfEnteries;
	public TechnicalJournals(int numberOfPages, String author, String title, int numberOfEnteries) {
		super(numberOfPages, author, title);
		this.numberOfEnteries=numberOfEnteries;
	}
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
