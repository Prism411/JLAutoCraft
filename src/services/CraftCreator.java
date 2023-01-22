package services;

import entities.Craft;
import entities.PlaceType;

public class CraftCreator {
	
	
	private Craft craft;

	public Craft getCraft() {
		return craft;}
	public void setCraft(Craft craft) {
		this.craft = craft;}
	
	public CraftCreator(Craft craft) {
		this.craft = craft;
	}
	public static void CraftCreate(Craft craft) {
		PlaceType placeType = craft.getPlaceType();
		switch (placeType) {
		
		case CAPITULO: System.out.println("gay");
			break;
			
		case LOJA: System.out.println("loja");
		break;
		
		case BETHEL: System.out.println("loja");
		break;
			
		}
	}
	

	
	
	
	

}
