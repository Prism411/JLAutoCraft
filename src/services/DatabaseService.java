package services;

import java.util.List;
import java.util.Scanner;

import entities.PlaceData;
import entities.PlaceType;

public class DatabaseService {

	public static void DatabaseTypeFilter(PlaceType pT, Scanner sc) {
		switch (pT) {

		case CAPITULO:DatabaseSelectorCAPITULO(sc); break;

		case LOJA: DatabaseSelectorLOJA(sc); break;

		case BETHEL: DatabaseSelectorBETHEL(sc); break;

		}

	}

	public static void DatabaseSelectorCAPITULO(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = 0;
		for (PlaceData e : list) {
			f++;
			if(e.getpT() == PlaceType.CAPITULO) {
		           System.out.printf("\n%d   - %s\n", f, e);}
		}
	}
	
	public static void DatabaseSelectorLOJA(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = 0;
		for (PlaceData e : list) {
			f++;
			if(e.getpT() == PlaceType.LOJA) {
		           System.out.printf("\n%d   - %s\n", f, e);}
		}
	}
	
	public static void DatabaseSelectorBETHEL(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = 0;
		for (PlaceData e : list) {
			f++;
			if(e.getpT() == PlaceType.BETHEL) {
		           System.out.printf("\n%d   - %s\n", f, e);}
		}
	}

	public static void DatabaseSelector(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = 0;
		for (PlaceData e : list) {
			System.out.printf("\n%d   - %s\n", f, e);
			f++;
		}

	}
}
