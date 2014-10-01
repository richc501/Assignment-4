package ReadingMaterials;

public class TextBook extends ReadingMaterials {
	private int numberOfVersions, numberOfUnits;
	public TextBook(int numberOfPages, String author, String title, int numberOfVersions, int numberOfUnits) {
		super(numberOfPages, author, title);
		this.numberOfVersions=numberOfVersions;
		this.numberOfUnits=numberOfUnits;
	}
	public int getNumberOfVersions() {
		return numberOfVersions;
	}
	public void setNumberOfVersions(int numberOfVersions) {
		this.numberOfVersions = numberOfVersions;
	}
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	@Override
	public String toString() {
		return "TextBook [numberOfVersions=" + numberOfVersions
				+ ", numberOfUnits=" + numberOfUnits + ", getNumberOfPages()="
				+ getNumberOfPages() + ", getAuthor()=" + getAuthor()
				+ ", getTitle()=" + getTitle() + "]";
	}
	
}
