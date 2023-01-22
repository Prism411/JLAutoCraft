package application;

import entities.Craft;
import services.Reader;

public class Main {

	public static void main(String[] args) {
		
		Craft craft = Reader.ReadData();
		System.out.println(craft);
	}

}
