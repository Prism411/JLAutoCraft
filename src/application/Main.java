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
		int opcao = 0, toPlaceNumber = 0;
		PlaceType pT = null;
		String toName,toPlaceName,reason,meetingTime,dayCraft,monthCraft;
		Scanner sc = new Scanner(System.in);
		boolean sucess = false;
		while (sucess == false) {
		try {
		while (opcao !=5) {
			System.out.printf("\t\t\tJLAUTOCRAFT MENU 0.1\n1-Novo Oficio\n2-Mudar Endereço\n3-Mudar Loja Patrocinadora\n4-Mudar dados da gestão\n5-Sair");
			opcao = sc.nextInt();
			sucess = true;
		
		switch (opcao) {
		
		case 1: 
		System.out.println("Qual o tipo de oficio a ser criado?");
		System.out.println("1-Capitulos (Irmãos)");
		System.out.println("2-Betheis (Primas)");
		System.out.println("3-Lojas (Tios)");
		System.out.println("4-Pessoa (Pessoa Comum)");
		System.out.println("5-Permissão de Loja (Tios/Loja Patrocinadora)");
		int choice = sc.nextInt();
		sc.nextLine();
		CraftMenu.ChooseType(choice, pT);
		System.out.println("Nome do Lugar");
		toPlaceName = sc.nextLine();
		System.out.println("Numero do Lugar");
		toPlaceNumber = sc.nextInt(); sc.nextLine();
		System.out.println("Nome do(a) VM,HR,MC,Pessoa...");
		toName = sc.nextLine();
		System.out.println("Assunto:");
		reason = sc.nextLine();
		System.out.println("Horario da reunião (XX:XX)");
		meetingTime = sc.nextLine();
		System.out.println("Dia da reunião ");
		dayCraft = sc.nextLine();
		System.out.println("Mes da Reunião ");
		monthCraft = sc.nextLine();
		
		CraftCreator.UserCraftCreator(pT, toPlaceNumber, toName, toPlaceName, reason, meetingTime, dayCraft, monthCraft);

		
		
		break;
		
		case 2:
			
			
			
			
		}
		
		
		
		}
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
