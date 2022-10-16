package kodlamaIODemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIODemo.core.logging.Logger;
import kodlamaIODemo.dataAccess.CategoryDao;
import kodlamaIODemo.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<Logger> loggers;
	private List<Category> categories = new ArrayList<Category>();
	
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	
	public void add(Category category) throws Exception{
		
		for(Category x : categories) {
			if(x.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Aynı isimde kategori mevcut.Ekleme yapamazsınız!");
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		for(Logger x : loggers) {
			x.log(category.getCategoryName());
		}
		
	}
	
}
