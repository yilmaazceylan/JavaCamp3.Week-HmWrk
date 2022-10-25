package kodlamaIOProject.DataAccess;

import kodlamaIOProject.Entities.Course;

public class HibernateCourseDao implements ICourseDao {
	public void add(Course course ) {
		   System.out.println("Hibernate ile veritabanına eklendi");

 }
	
}