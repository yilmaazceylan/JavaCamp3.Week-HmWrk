package kodlamaIOProject.Entities;

public class Course {
    private int id;
    private String courseName;
    private String courseTeacher;
    private double unitPrice;
    
	public Course() {
		super();
	}

	public Course(int id, String courseName, String courseTeacher, double unitPrice) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
