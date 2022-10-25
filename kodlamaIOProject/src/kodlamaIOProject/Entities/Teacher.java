package kodlamaIOProject.Entities;

public class Teacher {
	private int id;
	private String teacherName;
	private int age;
	
	public Teacher() {
		
	}

	public Teacher(int id, String teacherName, int age) {
		
		this.id = id;
		this.teacherName = teacherName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
