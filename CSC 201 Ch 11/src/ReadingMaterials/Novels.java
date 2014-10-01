package ReadingMaterials;

public class Novels extends Books{
	private int numberOfSquels;
	public Novels(int numberOfPages, String author, String title,
			int numberOfChapters, int numberOfCharacters,
			String nameOfMainCharacter, int numberOfSquels) {
		super(numberOfPages, author, title, numberOfChapters, numberOfCharacters,
				nameOfMainCharacter);
		this.numberOfSquels=numberOfSquels;
	}
	public int getNumberOfSquels() {
		return numberOfSquels;
	}
	public void setNumberOfSquels(int numberOfSquels) {
		this.numberOfSquels = numberOfSquels;
	}
	@Override
	public String toString() {
		return "Novels [numberOfSquels=" + numberOfSquels
				+ ", getNumberOfChapters()=" + getNumberOfChapters()
				+ ", getNumberOfCharacters()=" + getNumberOfCharacters()
				+ "\n , getNameOfMainCharacter()=" + getNameOfMainCharacter()
				+ ", getNumberOfPages()=" + getNumberOfPages()
				+ ", getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle()
				+ "]";
	}
	
}
