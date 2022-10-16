package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Courses;

public class JdbcCoursesDao implements CoursesDao{
	
	@Override
	public void add(Courses course) {
		
		System.out.println(course.getCourseName() + " kursu JDBC ile veritabanına eklendi.");
		
	}

}
