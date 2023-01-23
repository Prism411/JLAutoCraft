package application;

import java.io.IOException;

import entities.CraftStatic;
import entities.PlaceType;
import services.CraftCreator;
import services.Loader;
import services.Reader;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws IOException {
		
		CraftStatic cS = Reader.ReadStaticData();
		System.out.println(cS);
		
		
		Loader.CreateTodayDate(); //voce precisa chamar esse metodo pra criar uma data a partir do dia.
		Loader.AddCraftNumber(); //voce chama esse metodo para adicionar um numero no oficio
		
		

	}

}
