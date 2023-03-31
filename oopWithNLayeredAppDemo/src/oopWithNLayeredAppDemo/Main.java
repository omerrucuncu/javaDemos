package oopWithNLayeredAppDemo;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppDemo.business.concretes.CategoryManager;
import oopWithNLayeredAppDemo.business.concretes.CourseManager;
import oopWithNLayeredAppDemo.business.concretes.InstructorManager;
import oopWithNLayeredAppDemo.core.logging.abstracts.ILogger;
import oopWithNLayeredAppDemo.core.logging.concretes.DatabaseLogger;
import oopWithNLayeredAppDemo.core.logging.concretes.FileLogger;
import oopWithNLayeredAppDemo.dataAccess.concrets.category.JdbcCategoryDao;
import oopWithNLayeredAppDemo.dataAccess.concrets.course.JdbcCourseDao;
import oopWithNLayeredAppDemo.dataAccess.concrets.instructor.HibernateInstructorDao;
import oopWithNLayeredAppDemo.entities.Category;
import oopWithNLayeredAppDemo.entities.Course;
import oopWithNLayeredAppDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		ILogger[] loggers = { new FileLogger(), new DatabaseLogger() };

		Course course1 = new Course("Java", 5000);
		Course course2 = new Course("C#", 20000);

		Course[] courses = { course1 };

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
		courseManager.add(course2);

		System.out.println("-------------------------------------");

		Instructor instructor1 = new Instructor("Omer", 1);
		Instructor instructor2 = new Instructor("Hasan", 2);

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor2);

		System.out.println("-------------------------------------");

		Category category1 = new Category("Programlama");
		Category category2 = new Category("Web");

		Category[] categories = { category1 };

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		categoryManager.add(category2);

	}

}
