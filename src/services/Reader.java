package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.Craft;
import entities.CraftStatic;
import entities.PlaceType;

public class Reader {
	
	public static CraftStatic ReadData() {
	
	CraftStatic cS = null;
	String path = "c:\\temp\\CraftStatic.txt";

	try (BufferedReader br = new BufferedReader(new FileReader(path))){
		int ManagementNumber = Integer.parseInt(br.readLine());
		System.out.println(ManagementNumber);
		int CraftYear = Integer.parseInt(br.readLine());
		System.out.println(CraftYear);
		
		String pccName = br.readLine();
		System.out.println(pccName);
		
		String escrvName = br.readLine();
		System.out.println(escrvName);
		
		String mcName = br.readLine();
		System.out.println(mcName);
		
		String mcContact = br.readLine();
		System.out.println(mcContact);
		
		String fromChapterName = br.readLine();
		System.out.println(fromChapterName);
		
		String fromChapterNumber = br.readLine();
		System.out.println(fromChapterNumber);
		
		cS = new CraftStatic(ManagementNumber, CraftYear, pccName, escrvName, mcName, mcContact, fromChapterName, fromChapterNumber);


	}catch (IOException e) {
		System.out.println("ERRO IO EXCEPTION");
	}
	return cS;

		
	}

}
