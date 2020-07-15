package models;

public class SanitizerFactory extends AbstractFactory {
	
	@Override
	public Sanitizer getSanitizer(String sanitizer) {
		Sanitizer sani = null;
		
		switch(sanitizer.toLowerCase()){
			case "germx":
				sani = new GermXSanitizer();
				break;
			case "artnaturals":
				sani = new ArtNaturalsSanitizer();
				break;
			case "equate":
				sani = new EquateSanitizer();
				break;
		}
		
		return sani;
	}

	@Override
	public Alcohol getAlcohol(String alcoholBrand) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
