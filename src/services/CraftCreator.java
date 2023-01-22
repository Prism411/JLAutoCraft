package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entities.Craft;
import entities.PlaceType;

public class CraftCreator {
	
	
	private Craft craft;

	public Craft getCraft() {
		return craft;}
	public void setCraft(Craft craft) {
		this.craft = craft;}
	
	public CraftCreator(Craft craft) {
		this.craft = craft;
	}
	public static void CraftCreate(Craft craft) {
		PlaceType placeType = craft.getPlaceType();
		switch (placeType) {
		
		case CAPITULO: System.out.println("gay");
			break;
			
		case LOJA: System.out.println("loja");
		break;
		
		case BETHEL: System.out.println("bethel");
		break;
			
		}
	}
	

	    public static void writeOffice(Craft craft) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craft.getCraftNumber() + "/" + craft.getCraftYear() + " " + craft.getFromPlacename() + ", " + craft.getCraftDate() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append("o Senhor,\n");
	        office.append(craft.getToCraftName() + ",\n");
	        office.append("Mestre Fuleiro\n");
	        office.append(craft.getPlaceName() + ", Porto Velho, Rondônia.\n\n");
	        office.append("Assunto: " + craft.getReason() + "\n\n");
	        office.append("Queridíssimo Meste Fuleiro,\n");
	        office.append("Nós, do " + craft.getFromPlacename() + ", convidamos o Vosso Capítulo para a nossa Reunião Ritualística com a seguinte pauta: " + craft.getReason() + ". Ocorrerá no dia " + craft.getCraftDate() + ", às " + craft.getMeetingTime() + ", Em nosso Capitulo, localizado na " + craft.getAdress() + ".\n");
	        office.append("Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão " + craft.getMcName() + ". (Contato: " + craft.getMcContact() + ").\n");
	        office.append("Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("Fraternalmente,\n\n");
	        
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out.txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    
	}


	
	
	


