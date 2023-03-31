package oopWithNLayeredAppDemo.dataAccess.concrets.course;

import oopWithNLayeredAppDemo.dataAccess.abstracts.ICourseDao;
import oopWithNLayeredAppDemo.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {

		System.out.println("Hibernate ile veritabanına eklendi : " + course.getName());

	}

}
