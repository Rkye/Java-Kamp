package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Category;


public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println(category.getCategoryName() + " : JDBC ile veritabanına eklendi.");
		
	}

}
