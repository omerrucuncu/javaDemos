package oopWithNLayeredAppDemo.dataAccess.concrets.instructor;

import oopWithNLayeredAppDemo.dataAccess.abstracts.IIntructorDao;
import oopWithNLayeredAppDemo.entities.Instructor;

public class HibernateInstructorDao implements IIntructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi : " + instructor.getName());
		
	}

}
