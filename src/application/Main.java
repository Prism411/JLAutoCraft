package application;

import entities.Craft;
import entities.CraftStatic;
import entities.PlaceType;
import services.CraftCreator;
import services.Loader;
import services.Reader;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		CraftStatic cS = Reader.ReadData();
		System.out.println(cS);

	}

}
