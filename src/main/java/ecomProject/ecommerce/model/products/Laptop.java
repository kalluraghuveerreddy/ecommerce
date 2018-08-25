package ecomProject.ecommerce.model.products;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import ecomProject.ecommerce.model.Product;


@Entity
@Component
public class Laptop extends Product {
	
	private String ram;
	private String laptopBrand;
	private String processor;
	private String harddisk;
	
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}
	
	
	

}
