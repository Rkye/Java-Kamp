package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println(category.getCategoryName() + " : Hibernate ile veritabanına eklendi.");
		
	}

}
