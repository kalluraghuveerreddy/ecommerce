package ecomProject.ecommerce;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ecomProject.ecommerce.dao.CategoryDaoService;
import ecomProject.ecommerce.dao.EndUserDaoService;
import ecomProject.ecommerce.dao.ProductDaoService;
import ecomProject.ecommerce.dao.SubCategoryDaoService;
import ecomProject.ecommerce.dao.VendorDaoService;
import ecomProject.ecommerce.dao.products.LaptopDaoService;
import ecomProject.ecommerce.daoImpl.SubCategoryDaoServiceImpl;
import ecomProject.ecommerce.model.Category;
import ecomProject.ecommerce.model.EndUser;
import ecomProject.ecommerce.model.Product;
import ecomProject.ecommerce.model.SubCategory;
import ecomProject.ecommerce.model.Vendor;
import ecomProject.ecommerce.model.products.Laptop;


@SpringJUnitConfig(classes = {Persistanceconfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {
		
		@Autowired
	    private	Vendor vendor;
	
		@Autowired
		private SubCategory subCategory;
		
		@Autowired
		private Laptop laptop;
		
		@Autowired
		private EndUser endUser;
		
		@Autowired
		private Category category;
		
		
		@Autowired
		private CategoryDaoService categoryDaoService;
		@Autowired
		private VendorDaoService vendorDaoService;
		@Autowired
		private ProductDaoService productDaoService;
		
		@Autowired
		private  LaptopDaoService laptopDaoService;
		@Autowired
		private SubCategoryDaoService subCategoryDaoService;
		@Autowired
		private EndUserDaoService endUserDaoService;
	
		
		
		@Before
		public void setVendor()
		{
			//AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext(Persistanceconfig.class);
			
			
			vendor.setVendor_name("Rishikesa");
			vendor.setCompany_name("niit");
			vendor.setVendor_email("rishi@gmail.com");
			vendor.setVendor_mobile("8978513016");
			vendor.setVendor_password("rishi123");
			
			
			laptop.setHarddisk("1TB");
			laptop.setLaptopBrand("MacBoook");
			laptop.setProcessor("i7");
			laptop.setRam("8GB");
			
			endUser.setName("Rahguveer");
			endUser.setEmail("kalluraghureddy@gmail.com");
			endUser.setMobile("7896541233");
			endUser.setPassword("raghu123");
		
		
		}
  
		@Test
		public void addVendor()
		{
		   assertEquals("Vendor Insertion Failed",true,vendorDaoService.addVendor(vendor));
		  deleteVendor();
		}	
		
		public void addUser()
		{
			 assertEquals("User  Insertion Failed",true,endUserDaoService.addEndUser(endUser));
			 deleteUser();
		}
		
        private void deleteUser() {
			endUserDaoService.delete(endUser);
			
		}

		@Test
		public void addLaptop()
		{
		
			subCategory=subCategoryDaoService.getSubCategory(1);
			
			vendorDaoService.addVendor(vendor);
			
			endUserDaoService.addEndUser(endUser);
			laptop.setVendor(vendor);
			laptop.setSubCategory(subCategory);
		
			assertEquals("Test Insertion laptop failed",true,laptopDaoService.addLaptop(laptop));
			deleteLaptop();
			deleteVendor();
			deleteUser();
		}
		
		private void deleteLaptop() {
			
			laptopDaoService.deleteLaptop(laptop);
			
		}

		public void deleteVendor()
		{
			vendorDaoService.deleteVendor(vendor);
		}
}
