package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.PlaceType;
import services.CraftCreator;
import services.CraftMenu;
import services.DatabaseService;
import services.Loader;
import services.PlaceDataHandler;

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
		while (opcao !=7) {
			System.out.printf("\t\t\tCRIADOR DE OFICIO DO CAPITULO PAULO ROBERTO DE AMORIM MENU 0.1\n1-Criar Oficio a partir do Banco de dados\n2-Novo Oficio do ZERO\n3-Mudar Endereço\n4-Mudar Loja Patrocinadora\n5-Mudar dados da gestão\n6-Adicionar no Banco de dados\n7-Sair");
			opcao = sc.nextInt(); sc.nextLine();
			sucess = true;
		
		switch (opcao) {
		
		case 1: choice = CraftMenu.ChoiceCreatorToDatabase(sc);
		pT = CraftMenu.ChooseType(choice, pT);
		DatabaseService.DatabaseSelector(pT,sc);
		break;
		
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

		System.out.println("cabo");
		break;
		
		case 3: // Inserir dados p/ CraftAdress
			break;
		
		case 4: //mudar dados sobre loja patrocinadora do capitulo
			break;
			
		case 5: String capName = CraftMenu.CapName(sc);
				String CapNumber = CraftMenu.CapNumber(sc);
				int ManagementNumber = CraftMenu.ManagementNumber(sc);
				String McName = CraftMenu.McName(sc);
				String McContact = CraftMenu.McContact(sc);
				String escrvName = CraftMenu.EscrvName(sc);
				String pccName = CraftMenu.pccName(sc);
				Loader.writeCraftStatic(ManagementNumber, pccName,escrvName, McName, McContact, capName, CapNumber);
				System.out.println("Informações Implementadas! REINICIANDO!!!");
			//aqui muda os dados sobre a gestão (CraftStatic)
			break;	
		case 6: System.out.println("Adicionando nova Preset no banco de dados!");
		choice = CraftMenu.ChoiceCreator(sc);
		pT = CraftMenu.ChooseType(choice, pT);
		toPlaceName = CraftMenu.toPName(sc);
		toPlaceNumber = CraftMenu.toPNumber(sc); sc.nextLine();
		toName = CraftMenu.toPersonName(sc);
		PlaceDataHandler.CREATEToFile(pT,toPlaceNumber,toPlaceName, toName);
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
		//Loader.writeCraftStatic(2, "Marcos Beloti Leal", "Jáder Louis", "Guilherme Beloti", "reiasdasds", "rasdadseis", "reisaasd");
		//cria um CraftAdress
		Loader.WriteCraftAdress("Rua Cabo Liria, Madeira Mamore", "Paz Universal", 18);

	}
	


}
