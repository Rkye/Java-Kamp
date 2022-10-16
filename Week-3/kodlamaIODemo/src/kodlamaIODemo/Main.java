package kodlamaIODemo;

import java.util.ArrayList;
import java.util.List;

import kodlamaIODemo.business.CategoryManager;
import kodlamaIODemo.business.CourseManager;
import kodlamaIODemo.business.EducatorManager;
import kodlamaIODemo.core.logging.DatabaseLogger;
import kodlamaIODemo.core.logging.FileLogger;
import kodlamaIODemo.core.logging.Logger;
import kodlamaIODemo.core.logging.MailLogger;
import kodlamaIODemo.dataAccess.HibernateCategoryDao;
import kodlamaIODemo.dataAccess.JdbcCategoryDao;
import kodlamaIODemo.dataAccess.JdbcCoursesDao;
import kodlamaIODemo.dataAccess.JdbcEducatorDao;
import kodlamaIODemo.entities.Category;
import kodlamaIODemo.entities.Courses;
import kodlamaIODemo.entities.Educator;


public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger());
		//loggers.add(new FileLogger());
		//loggers.add(new MailLogger());
		
		Category category = new Category(1,"Full Stack");
		Category category2 = new Category(2,"Back-end");
		//Category category3 = new Category(3,"Back-end");
		
		
		List<Category> categoryList = new ArrayList<Category>();
		categoryList.add(category);
		categoryList.add(category2);
		//categoryList.add(category3);
		
		
	    CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
	    categoryManager.add(category);
	    categoryManager.add(category2);
	    //Aynı isimle kategori eklenemez.
	    //categoryManager.add(category3);
		
		Courses courses = new Courses(3,"Java",750,"C#.jpeg","C# programlama dili için temel programlama mantığını anlaşılır örneklerle öğrenin.",category2);
		// Aynı isimle kurs eklenemez.
		Courses courses1 = new Courses(3,"Java",500,"C#.jpeg","C# programlama dili için temel programlama mantığını anlaşılır örneklerle öğrenin.",category2);
		//Kursun fiyatı 0 dan küçük olamaz.
		//Courses courses2 = new Courses(3,"C#",-500,"C#.jpeg","C# programlama dili için temel programlama mantığını anlaşılır örneklerle öğrenin.",category2);
		
		CourseManager courseManager = new CourseManager(new JdbcCoursesDao(), loggers);
		courseManager.add(courses);
		//courseManager.add(courses1);
		//courseManager.add(courses2);
		
		//Educator educator = new Educator(1,"Engin","Demiroğ","abc.jpeg");
		//Educator educator2 = new Educator(2,"Rukiye","Arabacı","123.jpeg");
		
		//EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(), loggers);
		//educatorManager.add(educator);
        //educatorManager.add(educator2);
		

	}

}
