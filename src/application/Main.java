package application;

import java.io.IOException;

import entities.CraftAuto;
import entities.CraftStatic;
import entities.PlaceType;
import entities.craftAdress;
import services.CraftCreator;
import services.Loader;
import services.Reader;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws IOException {
		
		CraftStatic cS = Reader.ReadStaticData();
		System.out.println(cS);
		
		CraftAuto a = Reader.ReadAutoData(); //le os valores do oficio automatizado
		System.out.println(a);
		
		//cria um novo CraftFloat com esses dados
		Loader.writeCraftFloat(PlaceType.CAPITULO, 0, "teste", "teste", "teste", "teste", "teste", "teste"); 
		//cria um novo CraftStatic com esses dados
		Loader.writeCraftStatic(0, "teste", "teste", "teste", "teste", "teste", "teste");
		//cria um CraftAdress
		Loader.WriteCraftAdress("Rua Cabo Liria, Madeira Mamore", "Paz Universal", 18);
		craftAdress cA = Reader.readCraftAdress();
		System.out.println(cA);
		
		//Loader.CreateTodayDate(); //voce precisa chamar esse metodo pra criar uma data a partir do dia.
		//Loader.AddCraftNumber(); //voce chama esse metodo para adicionar um numero no oficio
		//Loader.RemoveCraftNumber(); //chama esse metodo para remover um numero do oficio
		
		

	}

}
