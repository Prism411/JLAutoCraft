package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.CraftAuto;
import entities.CraftFloat;
import entities.CraftStatic;
import entities.PlaceType;


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
		
		return null;
	}
	
	public static CraftAuto ReadAutoData() {
		 LocalDate dataAtual = LocalDate.now();
	        String dataFormatada = dataAtual.format(DateTimeFormatter.ofPattern("dd, MM, yyyy"));
	 
	        // Cria o arquivo de texto
	        Path arquivo = Paths.get("data.txt");
	        Files.createFile(arquivo);
		
		
		
		
		return null;
	}

}
