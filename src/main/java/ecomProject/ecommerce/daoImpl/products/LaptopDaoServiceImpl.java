package ecomProject.ecommerce.daoImpl.products;


import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ecomProject.ecommerce.dao.products.LaptopDaoService;
import ecomProject.ecommerce.model.products.Laptop;
@Component
@Transactional
public class LaptopDaoServiceImpl  implements LaptopDaoService{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addLaptop(Laptop laptop) {
		try {
			sessionFactory.getCurrentSession().save(laptop);
			return true;			
		} catch (HibernateException e) {
			
			return false;
		}
	}

	@Override
	public boolean deleteLaptop(Laptop laptop) {
		
		try {
			sessionFactory.getCurrentSession().delete(laptop);
			return true;			
		} catch (HibernateException e) {
			
			return false;
		}
	}

	
}
