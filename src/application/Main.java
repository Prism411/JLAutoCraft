package application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.CraftAuto;
import entities.CraftFloat;
import entities.CraftStatic;
import entities.PlaceType;
import entities.craftAdress;
import services.CraftCreator;
import services.CraftMenu;
import services.Loader;
import services.Reader;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args)  {
		int opcao = 0, toPlaceNumber = 0, choice = 0;
		PlaceType pT = null;
		String toName,toPlaceName,reason,meetingTime,dayCraft,monthCraft;
		Scanner sc = new Scanner(System.in);
		boolean sucess = false;
		while (sucess == false) {
		try {
		while (opcao !=5) {
			System.out.printf("\t\t\tJLAUTOCRAFT MENU 0.1\n1-Criar Oficio a partir do Banco de dados\n2-Novo Oficio do ZERO\n3-Mudar Endereço\n4-Mudar Loja Patrocinadora\n5-Mudar dados da gestão\n6-Sair");
			opcao = sc.nextInt();
			sucess = true;
		
		switch (opcao) {
		
		case 1:
		
		case 2: 
	
		choice = CraftMenu.ChoiceCreator(sc);

		pT = CraftMenu.ChooseType(choice, pT);
	
		toPlaceName = CraftMenu.toPName(sc);
		
		toPlaceNumber = CraftMenu.toPNumber(sc); sc.nextLine();
		
		toName = CraftMenu.toPersonName(sc);

		reason = CraftMenu.toReason(sc);
		
		meetingTime = CraftMenu.toMeetingTime(sc);
		
		dayCraft = CraftMenu.toDayDate(sc);
		
		monthCraft = CraftMenu.toMonthDate(sc);

		CraftCreator.UserCraftCreator(pT, toPlaceNumber, toName, toPlaceName, reason, meetingTime, dayCraft, monthCraft, sc);

		break;
		
		case 3: // Inserir dados p/ CraftAdress
			break;
		
		case 4: //mudar dados sobre loja patrocinadora do capitulo
			break;
			
		case 5: //aqui muda os dados sobre a gestão (CraftStatic)
			break;	
			
		}
		
		
		
		}
		sc.close();
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("ERRO! digite um numero!");
			System.out.printf("\t\t\tJLAUTOCRAFT MENU 0.1\n1-Criar um Oficio\n2-Mudar Endereço\n3-Mudar Loja Patrocinadora\n4-Mudar dados da gestão\n5-sair\n");
			sucess = false;
		}
		}
		//cria um novo CraftStatic com esses dados
		Loader.writeCraftStatic(2, "Marcos Beloti Leal", "Jáder Louis", "Guilherme Beloti", "reiasdasds", "rasdadseis", "reisaasd");
		//cria um CraftAdress
		Loader.WriteCraftAdress("Rua Cabo Liria, Madeira Mamore", "Paz Universal", 18);

	}
	


}
