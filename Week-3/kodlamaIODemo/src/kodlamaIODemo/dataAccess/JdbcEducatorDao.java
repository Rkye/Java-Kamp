package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Educator;

public class JdbcEducatorDao implements EducatorDao{
	
	@Override
	public void add(Educator educator) {
		
		System.out.println(educator.getFirstName() + " " + educator.getLastName() 
		+ " : JDBC ile veritabanına eklendi");
		
	}

}
