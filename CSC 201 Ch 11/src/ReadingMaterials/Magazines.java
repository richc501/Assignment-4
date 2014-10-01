package ReadingMaterials;

public class Magazines extends ReadingMaterials{
	private int numberOfVolumes;
	public Magazines(int numberOfPages, String author, String title, int numberOfVolumes) {
		super(numberOfPages, author, title);
		this.numberOfVolumes=numberOfVolumes;
	}
	public int getNumberOfVolumes() {
		return numberOfVolumes;
	}
	public void setNumberOfVolumes(int numberOfVolumes) {
		this.numberOfVolumes = numberOfVolumes;
	}
	@Override
	public String toString() {
		return "Magazines [numberOfVolumes=" + numberOfVolumes
				+ ", getNumberOfPages()=" + getNumberOfPages()
				+ ", getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle()
				+ "]";
	}
}
