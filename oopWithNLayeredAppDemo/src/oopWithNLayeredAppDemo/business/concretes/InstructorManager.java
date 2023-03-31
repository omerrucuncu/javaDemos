package oopWithNLayeredAppDemo.business.concretes;

import oopWithNLayeredAppDemo.business.abstracts.IInstructorManager;
import oopWithNLayeredAppDemo.core.logging.abstracts.ILogger;
import oopWithNLayeredAppDemo.dataAccess.abstracts.IIntructorDao;
import oopWithNLayeredAppDemo.entities.Instructor;

public class InstructorManager implements IInstructorManager {

	private IIntructorDao instructorDao;
	private ILogger[] loggers;

	public InstructorManager(IIntructorDao instructorDao, ILogger[] loggers) {

		this.instructorDao = instructorDao;
		this.loggers = loggers;

	}

	@Override
	public void add(Instructor instructor) {

		instructorDao.add(instructor);

		for (ILogger logger : loggers) {
			logger.add(instructor.getName());
		}

	}

}
