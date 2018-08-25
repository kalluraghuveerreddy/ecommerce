package ecomProject.ecommerce.dao;

import ecomProject.ecommerce.model.EndUser;

public interface EndUserDaoService {
	
	public boolean addEndUser(EndUser endUser);
	public boolean delete(EndUser endUser);

}
