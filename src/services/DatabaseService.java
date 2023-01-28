package services;

import java.util.Scanner;

import entities.PlaceType;

public class DatabaseService {
	

	public static void DatabaseSelector(PlaceType pT,Scanner sc) {
		switch (pT) {
		
		case CAPITULO: ifCapitulo(sc); break;
			
		case BETHEL: ifBethel(sc);break;
			
		case LOJA: ifLoja(sc); break;
		default: System.out.println("Só pode ser Capitulo,Bethel,ou Loja!");
			break;		
} 


	}

	private static void ifCapitulo(Scanner sc) {
		PlaceType pT = PlaceType.CAPITULO;
		System.out.println("Selecione os capitulos!");
		System.out.println("  1 -   Capitulo Zito ");
		System.out.println("  2 -   Capitulo P.R.A ");
		int opcao = sc.nextInt();
		sc.nextLine();
		switch (opcao) {
		case 1:
			String toPlaceName = "José Zito da Silva";
			int toPlaceNumber = 604;
			String toName = "Pedro Frazão";

			String reason = CraftMenu.toReason(sc);
			String meetingTime = CraftMenu.toMeetingTime(sc);
			String dayCraft = CraftMenu.toDayDate(sc);
			String monthCraft = CraftMenu.toMonthDate(sc);

			CraftCreator.UserCraftCreator(pT, toPlaceNumber, toName, toPlaceName, reason, meetingTime, dayCraft, monthCraft, sc);
			break;
		case 2:
		}
		
		
	}
	
	private static void ifBethel(Scanner sc) {
		System.out.println("Selecione os Betheis!");
		System.out.println(" 1 -    BETHEL 08");
		
	}
	private static void ifLoja(Scanner sc) {
		System.out.println("Selecione a Loja");
		System.out.println(" 1 -  PAZ UNIVERSAL");
}
}