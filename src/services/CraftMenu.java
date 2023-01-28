package services;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.PlaceType;

public class CraftMenu {
	//CraftFloat Begin
	public static PlaceType ChooseType(int choice,PlaceType pT) {
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
		 pt = ChooseType(opcao,pt);
		return pt.toString();  
		case 2:
			System.out.println("Entre com o novo Numero do Capitulo");
			String num = sc.nextLine();
			return num;
		case 3: System.out.println("Entre com o novo nome da Pessoa");
		word = sc.nextLine();
		return word;
		case 4: System.out.println("Entre com o novo Assunto");
		word = sc.nextLine();
		return word;
		case 5: System.out.println("Entre com o novo horario");
		word = sc.nextLine();
		return word;
		case 6: System.out.println("Entre com o novo dia da reuniao");
		word = sc.nextLine();
		return word;
		case 7: System.out.println("Entre com o novo mes");
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
		System.out.println("Qual o tipo de oficio a ser criado?");
		System.out.println("1-Capitulos (Irmãos)");
		System.out.println("2-Betheis (Primas)");
		System.out.println("3-Lojas (Tios)");
		int choice = sc.nextInt();
		sc.nextLine();
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
	}

