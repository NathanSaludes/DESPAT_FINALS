package models;

public class GermXSanitizer implements Sanitizer{
	private String brand;
	private String price;
	private String contentAmnt;
	private String description;
	private String picture;
	
	public GermXSanitizer(){
		this.brand = "GermX";
		this.price = "$3.97";
		this.contentAmnt = "32 fl oz";
		this.description = "Our Original hand sanitizer has plenty of germ-fighting power, but sometimes having 8 fl oz. just isn’t enough. That’s where our economy size offerings come in. Equipped with a subtle and refreshing fragrance, "
				+ "our original hand sanitizer is a perfect counter germ fighter.";
		this.picture = "germx.jpg";
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
