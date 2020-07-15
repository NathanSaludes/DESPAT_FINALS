package models;

public abstract class AbstractFactory {
	public abstract Alcohol getAlcohol(String alcoholBrand);
	public abstract Sanitizer getSanitizer(String sanitizerBrand);

}
