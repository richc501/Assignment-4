package Courses;

public class Courses {
	private String title, description, department;
	private int courseNumber;
	public Courses(String title, String department, int courseNumber, String description)
	{
		super();
		this.title=title;
		this.department=department;
		this.courseNumber=courseNumber;
		this.description=description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	@Override
	public String toString() {
		return "Courses [title=" + title + ", description=" + description
				+ ", department=" + department + ", courseNumber="
				+ courseNumber + "]";
	}
}
