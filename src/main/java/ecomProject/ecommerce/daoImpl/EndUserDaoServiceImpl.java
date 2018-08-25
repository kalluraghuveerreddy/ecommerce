package ecomProject.ecommerce.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ecomProject.ecommerce.dao.EndUserDaoService;
import ecomProject.ecommerce.model.EndUser;

@Component
@Transactional
public class EndUserDaoServiceImpl  implements EndUserDaoService{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addEndUser(EndUser endUser) {
		
		try {
			
			sessionFactory.getCurrentSession().save(endUser);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean delete(EndUser endUser) {
		
		try {
			sessionFactory.getCurrentSession().delete(endUser);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

}
