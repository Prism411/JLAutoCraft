package application;

import entities.Craft;
import entities.PlaceType;
import services.Loader;
import services.Reader;

public class Main {

	public static void main(String[] args) {
		
		Loader.writeData(0, 0, PlaceType.CAPITULO, "Belotao", "Ian", "(69)99233203",2023);
		Craft craft = Reader.ReadData();
		

	}

}
