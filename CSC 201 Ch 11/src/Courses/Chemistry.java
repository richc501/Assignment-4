package Courses;

public class Chemistry extends Courses {
	private boolean isThereLab;
	public Chemistry(String title, String department, int courseNumber,
			String description, boolean isThereLab) {//constructors
		super(title, department, courseNumber, description);
		this.isThereLab=isThereLab;
	}
	//getters and setters
	public boolean isThereLab() {
		return isThereLab;
	}
	public void setThereLab(boolean isThereLab) {
		this.isThereLab = isThereLab;
	}
	@Override
	public String toString() {
		return "Chemistry [isThereLab=" + isThereLab + ", getTitle()="
				+ getTitle() + ", getDescription()=" + getDescription()
				+ "\n , getDepartment()=" + getDepartment()
				+ ", getCourseNumber()=" + getCourseNumber() + "]";
	}
}
