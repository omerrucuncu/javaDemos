package oopWithNLayeredAppDemo.business.concretes;

import java.util.ArrayList;

import oopWithNLayeredAppDemo.business.abstracts.ICourseManager;
import oopWithNLayeredAppDemo.core.logging.abstracts.ILogger;
import oopWithNLayeredAppDemo.dataAccess.abstracts.ICourseDao;
import oopWithNLayeredAppDemo.entities.Course;

public class CourseManager implements ICourseManager {

	private ICourseDao courseDao;
	private ILogger[] loggers;
	private Course[] courseList;

	public CourseManager(ICourseDao courseDao, ILogger[] loggers, Course[] courses) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courseList = courses;

	}

	@Override
	public void add(Course course) throws Exception {

		if (course.getPrice() <= 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}

		for (Course course_ : courseList) {
			if (course_.getName().equals(course.getName())) {
				throw new Exception("Kurs ismi mevcut");
			}
		}

		courseDao.add(course);

		for (ILogger logger : loggers) {
			logger.add(course.getName());
		}
	}
}
