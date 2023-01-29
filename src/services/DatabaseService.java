package services;

import java.util.List;
import java.util.Scanner;

import entities.CraftFloat;
import entities.PlaceData;
import entities.PlaceType;

public class DatabaseService {

	public static int DatabaseTypeFilter(PlaceType pT, Scanner sc) {
		int index = -1;
		switch (pT) {

		case CAPITULO:
			index = DatabaseSelectorCAPITULO(sc);
			break;

		case LOJA:
			index = DatabaseSelectorLOJA(sc);
			break;

		case BETHEL:
			index = DatabaseSelectorBETHEL(sc);
			break;

		}
		return index;

	}

	public static int DatabaseSelectorCAPITULO(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = -1;
		for (PlaceData e : list) {
			f++;
			if (e.getpT() == PlaceType.CAPITULO) {
				System.out.printf("\n%d   - %s\n", f, e);
			}
		}
		System.out.println("SELECIONE PELO ID!");
		int id = sc.nextInt();
		sc.nextLine();
		return id;
	}

	public static int DatabaseSelectorLOJA(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = -1;
		for (PlaceData e : list) {
			f++;
			if (e.getpT() == PlaceType.LOJA) {
				System.out.printf("\n%d   - %s\n", f, e);
			}
		}
		System.out.println("SELECIONE PELO ID!");
		int id = sc.nextInt();
		sc.nextLine();
		return id;
	}

	public static int DatabaseSelectorBETHEL(Scanner sc) {

		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = -1;
		for (PlaceData e : list) {
			f++;
			if (e.getpT() == PlaceType.BETHEL) {
				System.out.printf("\n%d   - %s\n", f, e);
			}
		}
		System.out.println("SELECIONE PELO ID!");
		int id = sc.nextInt();
		sc.nextLine();
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

	public static void CallDataBaseCreator(int index, Scanner sc) {
		List<PlaceData> list = PlaceDataHandler.READFromFile();
		FromDataBaseCreator(index, sc, list);
	}

	private static void FromDataBaseCreator(int index, Scanner sc, List<PlaceData> list) {
		PlaceData pD = list.get(index);
		System.out.println(pD);
		String reason = CraftMenu.toReason(sc);
		String meetingTime = CraftMenu.toMeetingTime(sc);
		String dayCraft = CraftMenu.toDayDate(sc);
		String monthCraft = CraftMenu.toMonthDate(sc);
		CraftCreator.UserCraftCreator(pD.getpT(), pD.getToPlaceNumber(), pD.getToName(), pD.getToPlaceName(), reason,
				meetingTime, dayCraft, monthCraft, sc);

	}
}
