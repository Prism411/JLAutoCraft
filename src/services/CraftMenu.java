package services;

import java.util.Scanner;

import entities.PlaceType;
import entities.craftAdress;

public class CraftMenu {
	//CraftFloat Begin
	public static PlaceType ChooseType(int choice,PlaceType pT, Scanner sc) {
	switch (choice) {
	case 1: System.out.println("Irmãos Selecionado!");
	pT = PlaceType.CAPITULO;
	break;
	case 2: System.out.println("Primas Selecionado!");
	pT = PlaceType.BETHEL;
	break;
	case 3: System.out.println("Tios Selecionado!");
	pT = PlaceType.LOJA;
	break;
	case 4: System.out.println("Pessoa Comum Selecionado!");
	pT = PlaceType.PESSOA;
	break;
	case 5: System.out.println("Tios/Loja Selecionado!");
	pT = PlaceType.LodgePerm;
	break;
	}
	if (pT == PlaceType.PESSOA) {
		CraftMenu.CraftToperson(sc,pT);
	}
	
	if (pT == PlaceType.LodgePerm) {
		CraftMenu.CraftToLodgePerm(sc, pT);
	}
	return pT;
}
	public static String toPName(Scanner sc) {
		System.out.println("Insira o nome do lugar");
		String toPlaceName = sc.nextLine();
		return toPlaceName;
	}
	public static int toPNumber(Scanner sc) {
		System.out.println("Insira o numero do Lugar)");
		int toPlaceNumber = sc.nextInt();
		return toPlaceNumber;
	}
	public static String toPersonName(Scanner sc) {
		System.out.println("Insira o nome da pessoa (MC/HR/VM/Pessoa Comum)");
		String toPName = sc.nextLine();
		return toPName;
	}
	public static String toReason(Scanner sc) {
		System.out.println("Insira o Assunto da Reunião");
		String toReason = sc.nextLine();
		return toReason;
	}
	public static String toMeetingTime(Scanner sc) {
		System.out.println("Horario da reunião (XX:XX)");
		String meetingTime = sc.nextLine();
		return meetingTime;
	}
	public static String toDayDate(Scanner sc) {
		System.out.println("Dia da reunião");
		String toDayDate = sc.nextLine();
		return toDayDate;
	}
	public static String toMonthDate(Scanner sc) {
		System.out.println("Mes da reunião");
		String toMonthDate = sc.nextLine();
		return toMonthDate;
	}
	@SuppressWarnings("unused")
	public static String ChangeTo(int choice, Scanner sc) {
		PlaceType pt=null;
		String word = "Nulo";
		int toPlaceNumber=0;
		switch (choice){
		
		case 1:
		System.out.println("Qual o tipo de oficio a ser criado?");
		System.out.println("1-Capitulos (Irmãos)");
		System.out.println("2-Betheis (Primas)");
		System.out.println("3-Lojas (Tios)");
		System.out.println("4-Pessoa (Pessoa Comum)");
		System.out.println("5-Permissão de Loja (Tios/Loja Patrocinadora)");
		int opcao = sc.nextInt();
		sc.nextLine();
		 pt = ChooseType(opcao,pt,sc);
		return pt.toString();  
		case 2: 
		System.out.println("Entre com o novo Nome do Lugar");
		word = sc.nextLine(); 
		return word;
		case 3:
			System.out.println("Entre com o novo Numero do Capitulo");
			String num = sc.nextLine();
			return num;
		case 4: System.out.println("Entre com o novo nome da Pessoa");
		word = sc.nextLine();
		return word;
		case 5: System.out.println("Entre com o novo Assunto");
		word = sc.nextLine();
		return word;
		case 6: System.out.println("Entre com o novo horario");
		word = sc.nextLine();
		return word;
		case 7: System.out.println("Entre com o novo dia da reuniao");
		word = sc.nextLine();
		return word;
		case 8: System.out.println("Entre com o novo mes");
		word = sc.nextLine();
		return word;
		}
		
		
		
		return word;
}
	//CraftFloat End
	//
	//MenuFunc to get PlaceType
	public static int ChoiceCreator(Scanner sc) {
		System.out.println("Qual o tipo de oficio a ser criado?");
		System.out.println("1-Capitulos (Irmãos)");
		System.out.println("2-Betheis (Primas)");
		System.out.println("3-Lojas (Tios)");
		System.out.println("4-Pessoa (Pessoa Comum)");
		System.out.println("5-Permissão de Loja (Tios/Loja Patrocinadora)");
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	public static int ChoiceCreatorToDatabase(Scanner sc) {
		int choice = 1;
		Boolean sucess = false;
		while (sucess == false) {
		System.out.println("Qual o tipo do Lugar?");
		System.out.println("1-Capitulos (Irmãos)");
		System.out.println("2-Betheis (Primas)");
		System.out.println("3-Lojas (Tios)");
		choice = sc.nextInt();
		sc.nextLine();
		if (choice >= 1 && choice <= 4)  {
		    sucess = true;
		}
		else {
		   sucess = false;
		   System.out.println("tem que ser entre 1 e 3");
		}
		}
		return choice;
	}
	
	
	//CraftStatic Begin
	public static int ManagementNumber(Scanner sc) {
		System.out.println("Numero do semestre da gestão (1-2)");
		int toPlaceNumber = sc.nextInt();
		sc.nextLine();
		return toPlaceNumber;
	}
	public static String pccName(Scanner sc) {
		System.out.println("Presidente do Conselho Consultivo nome:");
		String answer = sc.nextLine();
		return answer;
	}
	public static String EscrvName(Scanner sc) {
		System.out.println("Nome do Escrivão");
		String answer = sc.nextLine();
		return answer;
	}
	public static String McName(Scanner sc) {
		System.out.println("Nome do mestre COnselheiro");
		String answer = sc.nextLine();
		return answer;
	}
	public static String McContact(Scanner sc) {
		System.out.println("Contato do Mestre Conselheiro");
		String answer = sc.nextLine();
		return answer;
	}
	public static String CapName(Scanner sc) {
		System.out.println("Nome do Capitulo");
		String answer = sc.nextLine();
		return answer;
	}
	public static String CapNumber(Scanner sc) {
		System.out.println("Numero do Capitulo");
		String answer = sc.nextLine();
		return answer;
	}
	//CraftStatic End	
	
	public static void CraftToperson(Scanner sc,PlaceType pT) {
		System.out.println("PESSOA selecionado!");
		String toName = CraftMenu.toPersonName(sc);
		String reason = CraftMenu.toReason(sc);
		String meetingTime = CraftMenu.toMeetingTime(sc);
		String dayCraft = CraftMenu.toDayDate(sc);
		String monthCraft = CraftMenu.toMonthDate(sc);
		CraftCreator.UserCraftCreator(pT, 0, toName, "0", reason, meetingTime, dayCraft, monthCraft, sc);	
	}
	
	public static void CraftToLodgePerm(Scanner sc, PlaceType pT) {
		System.out.println("Deseja criar um oficio para a loja patrocinadora deste Capitulo? (s/n)");
		char op = sc.nextLine().charAt(0);
		switch (op) {
		case 's': 
			
			craftAdress cA = Reader.readCraftAdress();
			cA.getSponsorShop();
			cA.getSponsorShopNumber();

			String toName = CraftMenu.toPersonName(sc);
			
			String meetingTime = CraftMenu.toMeetingTime(sc);
			
			String dayCraft = CraftMenu.toDayDate(sc);
			
			String monthCraft = CraftMenu.toMonthDate(sc);

			CraftCreator.UserCraftCreator(pT, cA.getSponsorShopNumber(), toName, cA.getSponsorShop(), "nulo", meetingTime, dayCraft, monthCraft, sc);
			
			break;
		case 'n': 	
		String toPlaceName = CraftMenu.toPName(sc);
		int toPlaceNumber = CraftMenu.toPNumber(sc); sc.nextLine();	
		toName = CraftMenu.toPersonName(sc);
		meetingTime = CraftMenu.toMeetingTime(sc);	
		dayCraft = CraftMenu.toDayDate(sc);
		monthCraft = CraftMenu.toMonthDate(sc);
		CraftCreator.UserCraftCreator(pT, toPlaceNumber, toName, toPlaceName, "nulo", meetingTime, dayCraft, monthCraft, sc);
			
			break;
		
		default: System.out.println("INSIRA S/N");
		}
}

}
