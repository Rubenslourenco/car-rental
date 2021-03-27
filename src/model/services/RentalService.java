package model.services;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricePerhour;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerhour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerhour = pricePerhour;
		this.taxService = taxService;
	}
	
	
	

}
