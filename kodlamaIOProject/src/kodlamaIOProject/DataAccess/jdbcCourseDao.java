package kodlamaIOProject.DataAccess;

import kodlamaIOProject.Entities.Course;

public class jdbcCourseDao implements ICourseDao{
   public void add(Course course ) {
	   System.out.println("JDBC ile veritabanına eklendi");
	   
   }
   
}
