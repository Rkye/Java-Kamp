package kodlamaIODemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIODemo.core.logging.Logger;
import kodlamaIODemo.dataAccess.CoursesDao;
import kodlamaIODemo.entities.Courses;

public class CourseManager {
	
	private CoursesDao coursesDao;
	private List<Logger> loggers;
	private List<Courses> courses = new ArrayList<Courses>();
	
	public CourseManager(CoursesDao coursesDao, List<Logger> loggers) {
		this.coursesDao = coursesDao;
		this.loggers = loggers;
	}
	
	public void add(Courses cours) throws Exception {
		
		for(Courses x : courses) {
			if(  x.getCourseName() == cours.getCourseName()) {
				throw new Exception("Eklenilen kurs ismi mevcut.Ekleme yapamazsınız!"); 
			}
		}
		
	        if(cours.getPrice() < 0) {
				throw new Exception("Kursun fiyatı 0 dan küçük olamaz!");
			}
		
		
		coursesDao.add(cours);
		courses.add(cours);
		for(Logger x : loggers) {
			x.log(cours.getCourseName());
		}
	}

}
