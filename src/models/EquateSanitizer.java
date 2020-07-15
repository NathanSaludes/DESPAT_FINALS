package models;

public class EquateSanitizer implements Sanitizer {
	private String brand;
	private String price;
	private String contentAmnt;
	private String description;
	private String picture;
	
	public EquateSanitizer(){
		this.brand = "Equate";
		this.price = "$3.97";
		this.contentAmnt = "34 fl oz";
		this.description = "";
		this.picture = "equate.jpg";
	}
	
	public EquateSanitizer(String brand, String price, String alcoholPrcnt,
			String contentAmnt, String description, String picture) {
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
