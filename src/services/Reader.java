package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.Craft;
import entities.PlaceType;

public class Reader {
	
	public static Craft ReadData() {
	
	Craft c = null;
	String path = "c:\\temp\\in.txt";

	try (BufferedReader br = new BufferedReader(new FileReader(path))){
		int ManagementNumber = Integer.parseInt(br.readLine());
		System.out.println(ManagementNumber);
		int CraftNumber = Integer.parseInt(br.readLine());
		System.out.println(CraftNumber);
		PlaceType CraftType = PlaceType.valueOf(br.readLine());
		System.out.println(CraftType);
		String toName = br.readLine();
		System.out.println(toName);
		String mcName = br.readLine();
		System.out.println(mcName);
		String mcContact = br.readLine();
		System.out.println(mcContact);
		int craftYear = Integer.parseInt(br.readLine());
		System.out.println(craftYear);
		String placeName = br.readLine();
		System.out.println(placeName);
		c = new Craft(ManagementNumber,CraftNumber,CraftType,toName,mcName,mcContact,craftYear,placeName);

	}catch (IOException e) {
		System.out.println("ERRO IO EXCEPTION");
	}
	return c;

		
	}

}
