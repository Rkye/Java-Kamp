package kodlamaIODemo.business;

import kodlamaIODemo.dataAccess.EducatorDao;
import kodlamaIODemo.entities.Educator;
import java.util.List;
import kodlamaIODemo.core.logging.Logger;


public class EducatorManager {
	
	private EducatorDao educatorDao;
	private List<Logger> loggers;
	
	
	public EducatorManager(EducatorDao educatorDao, List<Logger> loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	} 

	
	public void add(Educator educator) {
		
		educatorDao.add(educator);
		for(Logger x : loggers) {
			x.log(educator.getFirstName() + " " + educator.getLastName());
		}
		
	}
	
	
}
