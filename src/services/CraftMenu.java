package services;

import entities.PlaceType;

public class CraftMenu {
	
	
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
	
}
