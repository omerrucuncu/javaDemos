package oopWithNLayeredAppDemo.dataAccess.concrets.instructor;

import oopWithNLayeredAppDemo.dataAccess.abstracts.IIntructorDao;
import oopWithNLayeredAppDemo.entities.Instructor;

public class JdbcInstructorDao implements IIntructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi : " + instructor.getName());

	}

}
