package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import entities.CraftAuto;
import entities.CraftFloat;
import entities.CraftStatic;
import entities.PlaceType;
import entities.craftAdress;


public class Reader {
	
	public static CraftStatic ReadStaticData() {
	
	CraftStatic cS = null;
	String path = "c:\\temp\\CraftStatic.txt";

	try (BufferedReader br = new BufferedReader(new FileReader(path))){
		int ManagementNumber = Integer.parseInt(br.readLine());
		System.out.println(ManagementNumber);

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
		
		cS = new CraftStatic(ManagementNumber, pccName, escrvName, mcName, mcContact, fromChapterName, fromChapterNumber);


	}catch (IOException e) {
		System.out.println("ERRO IO EXCEPTION");
	}
	return cS;
	}
	public static CraftFloat ReadFloatData() {
		CraftFloat cF = null;
		String path = "c:\\temp\\CraftFloat.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			PlaceType placeType = PlaceType.valueOf(br.readLine());
			System.out.println(placeType);

			int toPlaceNumber= Integer.parseInt(br.readLine());
			System.out.println(toPlaceNumber);
			
			String toName = br.readLine();
			System.out.println(toName);
			
			String toPlaceName = br.readLine();
			System.out.println(toPlaceName);
			
			String Reason = br.readLine();
			System.out.println(Reason);
			
			String meetingTime = br.readLine();
			System.out.println(meetingTime);
			
			String dayCraft = br.readLine();
			System.out.println(dayCraft);
			
			String monthCraft = br.readLine();
			System.out.println(monthCraft);
			
			cF = new CraftFloat(placeType, toPlaceNumber, toName, toPlaceName, Reason, meetingTime, dayCraft, monthCraft);
			
		}catch (IOException e) {
			System.out.println("ERRO IO EXCEPTION");
		}
		
		return cF;
	}
	public static CraftAuto ReadAutoData()  {
		String pathTodayDate = "c:\\temp\\CraftTodayDate.txt";
		String pathCraftNumber = "c:\\temp\\CraftNumber.txt";
		CraftAuto cA = null;
		try (BufferedReader br = new BufferedReader(new FileReader(pathTodayDate))){
        // Lê a primeira linha do arquivo
       String linha = br.readLine();

        // Divide a linha em um array de strings
        String[] data = linha.split(", ");
        // Obtém dia, mes e ano
        String dia = data[0];
        String mes = data[1];
        String ano = data[2];
        
        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);
        br.close();
        
        BufferedReader br2 = new BufferedReader(new FileReader(pathCraftNumber));
        int CraftNumber = Integer.parseInt(br2.readLine());
        System.out.println(CraftNumber);
        br2.close();
        
        cA = new CraftAuto(CraftNumber, dia, mes, ano);
		}catch (IOException e) {
			System.out.println("ERRO IO EXCEPTION");
		}
		return cA;
		
		}
		
	
	public static craftAdress readCraftAdress() {
		String path = "c:\\temp\\CraftAdress.txt";
		craftAdress cA = null;
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String Adress = br.readLine();
			String SponsorShop = br.readLine();
			int SponsorShopNumber = Integer.parseInt(br.readLine());
		cA = new craftAdress(Adress, SponsorShop, SponsorShopNumber);
	}catch (IOException e) {
		System.out.println("ERRO IO EXCEPTION");
}
	return cA;
	}
}
	
