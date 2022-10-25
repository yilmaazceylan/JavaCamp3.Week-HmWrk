package kodlamaIOProject.Business;

import java.util.List;

import kodlamaIOProject.Core.logging.Logger;
import kodlamaIOProject.DataAccess.TeacherDao;
import kodlamaIOProject.Entities.Teacher;

public class TeacherManager {
	private TeacherDao teacherDao;
	private List<Teacher> teachers;
	private Logger[] loggers;

	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {

		this.teacherDao = teacherDao;
		this.teachers = teachers;
		this.loggers = loggers;
	}

	public void add(Teacher teacher) {
		teacherDao.add(teacher);

		
	}

}
