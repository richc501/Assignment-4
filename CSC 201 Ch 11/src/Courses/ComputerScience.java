package Courses;

public class ComputerScience extends Courses{
	private String computerLanguage, programUsed;
	public ComputerScience(String title, String department, int courseNumber,
			String description, String computerLanguage, String programUsed) {
		super(title, department, courseNumber, description);
		this.computerLanguage=computerLanguage;
		this.programUsed=programUsed;
	}
	public String getComputerLanguage() {
		return computerLanguage;
	}
	public void setComputerLanguage(String computerLanguage) {
		this.computerLanguage = computerLanguage;
	}
	public String getProgramUsed() {
		return programUsed;
	}
	public void setProgramUsed(String programUsed) {
		this.programUsed = programUsed;
	}
	@Override
	public String toString() {
		return "ComputerScience [computerLanguage=" + computerLanguage
				+ "\n , programUsed=" + programUsed + ", getTitle()=" + getTitle()
				+ ", getDescription()=" + getDescription()
				+ "\n , getDepartment()=" + getDepartment()
				+ ", getCourseNumber()=" + getCourseNumber() + "]";
	}
	
}
