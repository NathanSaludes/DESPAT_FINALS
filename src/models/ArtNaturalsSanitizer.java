package models;

public class ArtNaturalsSanitizer implements Sanitizer {
	private String brand;
	private String price;
	private String contentAmnt;
	private String description;
	private String picture;
	
	
	
	public ArtNaturalsSanitizer() {
		this.brand = "Art Naturals Sanitizer";
		this.price = "$10";
		this.contentAmnt = "5 fl oz";
		this.description = "expensive";
		this.picture = "artnaturals.jpg";
	}
	
	public ArtNaturalsSanitizer(String brand, String price, String contentAmnt,
			String description, String picture) {
		super();
		this.brand = brand;
		this.price = price;
		this.contentAmnt = contentAmnt;
		this.description = description;
		this.picture = picture;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getContentAmnt() {
		return contentAmnt;
	}
	public void setContentAmnt(String contentAmnt) {
		this.contentAmnt = contentAmnt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	

}
