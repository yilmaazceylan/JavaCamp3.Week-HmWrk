package kodlamaIOProject.Business;

import java.util.List;

import kodlamaIOProject.Core.logging.Logger;
import kodlamaIOProject.DataAccess.ICourseDao;
import kodlamaIOProject.DataAccess.jdbcCourseDao;
import kodlamaIOProject.Entities.Course;

public class CourseManager {
	private ICourseDao icourseDao;
	private List<Course> courses;
	private Logger[] loggers;

	public CourseManager(ICourseDao icourseDao, Logger[] loggers) {
		super();
		this.icourseDao = icourseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Ürün fiyatı 0 dan küçük olamaz");
		}

		icourseDao.add(course);

		
		for (Logger logger : loggers) {
//			
//		
			logger.log(course.getCourseName());
		}

	}

}
