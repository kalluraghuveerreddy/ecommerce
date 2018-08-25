package ecomProject.ecommerce.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ecomProject.ecommerce.dao.VendorDaoService;
import ecomProject.ecommerce.model.Vendor;


@Component
@Transactional
public class VendorDaoServiceImpl implements VendorDaoService{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addVendor(Vendor vendor) {
		
		try {
			
			sessionFactory.getCurrentSession().save(vendor);
			return true;
			
		} catch (HibernateException e) {
			return false;
		}
		
		
	}

	@Override
	public boolean deleteVendor(Vendor vendor) {
		try {
			sessionFactory.getCurrentSession().delete(vendor);
			return true;			
		} catch (HibernateException e) {
		
			return false;
		}
		
	}

	@Override
	public boolean updateVendor(Vendor vendor) {
		try {
			sessionFactory.getCurrentSession().update(vendor);
			return true;			
		} catch (HibernateException e) {
		
			return false;
		}
	}

}
