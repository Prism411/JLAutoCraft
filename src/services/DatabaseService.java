package services;

import java.util.List;
import java.util.Scanner;

import entities.PlaceData;
import entities.PlaceType;

public class DatabaseService {

	public static int DatabaseTypeFilter(PlaceType pT, Scanner sc) {
		int index = -1;
		switch (pT) {

		case CAPITULO: index = DatabaseSelectorCAPITULO(sc); break;

		case LOJA: 	 index = DatabaseSelectorLOJA(sc); break;

		case BETHEL: index = DatabaseSelectorBETHEL(sc); break;

		}
		return index;

	}

	public static int DatabaseSelectorCAPITULO(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = -1;
		for (PlaceData e : list) {
			f++;
			if(e.getpT() == PlaceType.CAPITULO) {
		           System.out.printf("\n%d   - %s\n", f, e);}
		}
		System.out.println("SELECIONE PELO ID!");
		int id = sc.nextInt(); sc.nextLine();
		return id;
	}
	
	public static int DatabaseSelectorLOJA(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = -1;
		for (PlaceData e : list) {
			f++;
			if(e.getpT() == PlaceType.LOJA) {
		           System.out.printf("\n%d   - %s\n", f, e);}
		}
		System.out.println("SELECIONE PELO ID!");
		int id = sc.nextInt(); sc.nextLine();
		return id;
	}
	
	public static int DatabaseSelectorBETHEL(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = -1;
		for (PlaceData e : list) {
			f++;
			if(e.getpT() == PlaceType.BETHEL) {
		           System.out.printf("\n%d   - %s\n", f, e);}
		}
		System.out.println("SELECIONE PELO ID!");
		int id = sc.nextInt(); sc.nextLine();
		return id;
	}

	public static void DatabaseSelector(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = -1;
		for (PlaceData e : list) {
			System.out.printf("\n%d   - %s\n", f, e);
			f++;
		}


	}

	
	public static void DataBaseRemove(int index) {
		List<PlaceData> list = PlaceDataHandler.READFromFile();
		list.remove(index);
		PlaceDataHandler.WRITEListToFile(list);
	}
}
