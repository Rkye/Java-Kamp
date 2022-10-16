package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Courses;

public class HibernateCoursesDao implements CoursesDao{

	@Override
	public void add(Courses course) {
		
		System.out.println(course.getCourseName() + "kursu Hibernate ile veritabanına eklendi.");
		
	}
	
}
