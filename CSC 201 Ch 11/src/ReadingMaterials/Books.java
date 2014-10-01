package ReadingMaterials;

public class Books extends ReadingMaterials{
	private int numberOfChapters, numberOfCharacters;
	private String nameOfMainCharacter;
	public Books(int numberOfPages, String author, String title, int numberOfChapters, int numberOfCharacters, String nameOfMainCharacter) {
		super(numberOfPages, author, title);
		this.numberOfChapters=numberOfChapters;
		this.numberOfCharacters=numberOfCharacters;
		this.nameOfMainCharacter=nameOfMainCharacter;
	}
	public int getNumberOfChapters() {
		return numberOfChapters;
	}
	public void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}
	public int getNumberOfCharacters() {
		return numberOfCharacters;
	}
	public void setNumberOfCharacters(int numberOfCharacters) {
		this.numberOfCharacters = numberOfCharacters;
	}
	public String getNameOfMainCharacter() {
		return nameOfMainCharacter;
	}
	public void setNameOfMainCharacter(String nameOfMainCharacter) {
		this.nameOfMainCharacter = nameOfMainCharacter;
	}
	@Override
	public String toString() {
		return "Books [numberOfChapters=" + numberOfChapters
				+ ", numberOfCharacters=" + numberOfCharacters
				+ ", nameOfMainCharacter=" + nameOfMainCharacter
				+ "\n , getNumberOfPages()=" + getNumberOfPages()
				+ ", getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle()
				+ "]";
	}


}
