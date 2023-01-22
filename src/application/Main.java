package application;

import entities.Craft;
import entities.PlaceType;
import services.CraftCreator;
import services.Loader;
import services.Reader;

public class Main {

	public static void main(String[] args) {
		
		Loader.writeData(0, 0, PlaceType.BETHEL, "Belotao", "Ian", "(69)99233203",2023,"Zito");
		Craft craft = Reader.ReadData();
		CraftCreator.CraftCreate(craft);

	}

}
