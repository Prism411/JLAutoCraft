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
import services.Loader;
import services.Reader;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args)  {
		int opcao = 0;
		PlaceType pT = null;
		Scanner sc = new Scanner(System.in);
		boolean sucess = false;
		while (sucess == false) {
		try {
		while (opcao !=5) {
			System.out.printf("\t\t\tJLAUTOCRAFT MENU 0.1\n1-Criar um Oficio\n2-Mudar Endereço\n3-Mudar Loja Patrocinadora\n4-Mudar dados da gestão\n5-sair");
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
		try {
			
		//cria um novo CraftFloat com esses dados
		Loader.writeCraftFloat(PlaceType.LodgePerm, 0, "teste", "te	ste", "teste", "teste", "teste", "teste"); 
		//cria um novo CraftStatic com esses dados
		Loader.writeCraftStatic(732, "Marcos Beloti Leal", "Jáder Louis", "Guilherme Beloti", "reiasdasds", "rasdadseis", "reisaasd");
		//cria um CraftAdress
		Loader.WriteCraftAdress("Rua Cabo Liria, Madeira Mamore", "Paz Universal", 18);
		
		CraftStatic cS = Reader.ReadStaticData();
		System.out.println(cS);
		
		CraftFloat cF = Reader.ReadFloatData();
		
			Loader.CreateTodayDate();
	
		CraftAuto a = Reader.ReadAutoData(); //le os valores do oficio automatizado
		System.out.println(a);
		
		craftAdress cA = Reader.readCraftAdress();
		
		CraftCreator.CraftCreate(cF, cA, cS, a); //cria e escreve o oficio
		Loader.AddCraftNumber();
		
		System.out.println(cA);
		
		//Loader.writeCraftFloat(cria um novo CraftFloat com esses dados); 
		//Loader.writeCraftStatic(cria um novo CraftStatic com esses dados);
		//CraftCreator.CraftCreate(cF, cA, cS, a); //cria e escreve o oficio
		//Loader.CreateTodayDate(); //voce precisa chamar esse metodo pra criar uma data a partir do dia.
		//Loader.AddCraftNumber(); //voce chama esse metodo para adicionar um numero no oficio
		//Loader.RemoveCraftNumber(); //chama esse metodo para remover um numero do oficio
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
