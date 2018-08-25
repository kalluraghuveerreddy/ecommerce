package ecomProject.ecommerce.dao;

import ecomProject.ecommerce.model.Vendor;

public interface VendorDaoService {

	
	public boolean addVendor(Vendor vendor);
	public boolean deleteVendor(Vendor vendor);
	public boolean updateVendor(Vendor vendor);
}
