package kodlamaIOProject;

import javax.xml.catalog.CatalogManager;

import kodlamaIOProject.Business.CategoryManager;
import kodlamaIOProject.Business.CourseManager;
import kodlamaIOProject.Business.TeacherManager;
import kodlamaIOProject.Core.logging.DatabaseLogger;
import kodlamaIOProject.Core.logging.EmailLogger;
import kodlamaIOProject.Core.logging.FileLogger;
import kodlamaIOProject.Core.logging.Logger;
import kodlamaIOProject.DataAccess.HibernateCategoryDao;
import kodlamaIOProject.DataAccess.HibernateCourseDao;
import kodlamaIOProject.DataAccess.HibernateTeacherDao;
import kodlamaIOProject.DataAccess.JdbcCategoryDao;
import kodlamaIOProject.DataAccess.JdbcTeacherDao;
import kodlamaIOProject.DataAccess.jdbcCourseDao;
import kodlamaIOProject.Entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1=new Course(1,"Java","Engin Demiroğ",100);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new EmailLogger()};
		
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(),loggers);
		
		
		CourseManager courseManager=new CourseManager(new jdbcCourseDao(),loggers);
		courseManager.add(course1);
		
		TeacherManager teacherManager=new TeacherManager(new JdbcTeacherDao(),loggers);
		
	}

}
