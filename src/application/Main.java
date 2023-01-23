package application;

import java.io.IOException;

import entities.CraftStatic;
import entities.PlaceType;
import services.CraftCreator;
import services.Loader;
import services.Reader;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws IOException {
		
		CraftStatic cS = Reader.ReadStaticData();
		System.out.println(cS);
		Loader.CreateTodayDate();

	}

}
