package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		
		System.out.println(educator.getFirstName() + " " + educator.getLastName() 
		+ " : Hibernate ile veritabanına eklendi.");
		
	}
	
}
