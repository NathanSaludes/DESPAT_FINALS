package models;

public class AlcoholFactory extends AbstractFactory {
	
	@Override
	public Alcohol getAlcohol(String alcohol) {
		Alcohol alco = null;
		
		switch(alcohol.toLowerCase()){
			case "biogenic":
				alco = new BiogenicAlcohol();
				break;
			case "doctorj":
				alco = new DoctorJAlcohol();
				break;
			case "cleene":
				alco = new CleeneAlcohol();
				break;
		}
		
		return alco;
	}

	@Override
	public Sanitizer getSanitizer(String sanitizerBrand) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
