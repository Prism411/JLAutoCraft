package services;

import java.util.List;
import java.util.Scanner;

import entities.PlaceData;
import entities.PlaceType;

public class DatabaseService {
	
	public static void DatabaseTypeFilter(PlaceType pT, Scanner sc) {
		switch (pT) {
		
		case CAPITULO:
			
		case LOJA:
			
		case BETHEL:
		
		
		}
		
		
		
	}
	

	public static void DatabaseSelector(Scanner sc) {
		
		List<PlaceData> list = PlaceDataHandler.READFromFile();
		int f = 0;
		for (PlaceData e : list) {
			System.out.printf("\n%d   - %s\n", f, e);
			f++;
		}
		
		
	
	
	}
	}
	