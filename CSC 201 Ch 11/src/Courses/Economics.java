package Courses;

public class Economics extends Courses {
	private String macroOrMicro;
	public Economics(String title, String department, int courseNumber,
			String description, String macroOrMicro) {//constructor
		super(title, department, courseNumber, description);
		this.macroOrMicro=macroOrMicro;
	}
	//getters and setters
	public String getMacroOrMicro() {
		return macroOrMicro;
	}
	public void setMacroOrMicro(String macroOrMicro) {
		this.macroOrMicro = macroOrMicro;
	}
	@Override
	public String toString() {
		return "Economics [macroOrMicro=" + macroOrMicro + ", getTitle()="
				+ getTitle() + ", getDescription()=" + getDescription()
				+ "\n , getDepartment()=" + getDepartment()
				+ ", getCourseNumber()=" + getCourseNumber() + "]";
	}
	
}
