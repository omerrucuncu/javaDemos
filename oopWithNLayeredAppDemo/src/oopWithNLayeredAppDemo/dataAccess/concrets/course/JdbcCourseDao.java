package oopWithNLayeredAppDemo.dataAccess.concrets.course;

import oopWithNLayeredAppDemo.dataAccess.abstracts.ICourseDao;
import oopWithNLayeredAppDemo.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi : " + course.getName());

	}

}
