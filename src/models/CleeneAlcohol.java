package models;

public class CleeneAlcohol implements Alcohol {
	
	private String brand;
	private String price;	
	private String alcoholPrcnt;
	private String contentAmnt;
	private String description;
	private String picture;
	
	public CleeneAlcohol() {
		this.brand = "Cleene";
		this.price = "$69.99";
		this.alcoholPrcnt = "70%";
		this.contentAmnt = "250 ml";
		this.description = "";
		this.picture = "cleene.jpg";
	}

	public CleeneAlcohol(String brand, String price, String alcoholPrcnt,
			String contentAmnt, String description, String picture) {
		super();
		this.brand = brand;
		this.price = price;
		this.alcoholPrcnt = alcoholPrcnt;
		this.contentAmnt = contentAmnt;
		this.description = description;
		this.picture = picture;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getAlcoholPrcnt() {
		// TODO Auto-generated method stub
		return this.alcoholPrcnt;
	}

	@Override
	public String getContentAmnt() {
		// TODO Auto-generated method stub
		return this.contentAmnt;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public String getPicture() {
		// TODO Auto-generated method stub
		return this.picture;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setAlcoholPrcnt(String alcoholPrcnt) {
		this.alcoholPrcnt = alcoholPrcnt;
	}

	public void setContentAmnt(String contentAmnt) {
		this.contentAmnt = contentAmnt;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
