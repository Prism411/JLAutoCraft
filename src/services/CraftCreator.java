package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entities.CraftAuto;
import entities.CraftFloat;
import entities.CraftStatic;
import entities.PlaceType;
import entities.craftAdress;

public class CraftCreator {
	

	public static void CraftCreate(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
		PlaceType placeType = craftfloat.getToplaceType();
		
		switch (placeType) {
		
		case CAPITULO: System.out.println("gayaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			break;
			
		case LOJA: System.out.println("loja");
		break;
		
		case BETHEL: System.out.println("bethel");
		break;
			
		}
	}
	

	    public static void writeOffice(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + ".2" + " " + craftauto.getCraftDate() + "/" + craftauto.getCraftMonth() + "/" + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append("o Senhor,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Mestre Fuleiro\n");
	        office.append(craftfloat.getToPlaceName() + "nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
	        office.append("Assunto: " + craftfloat.getReason() + "\n\n");
	        office.append("Queridíssimo Meste Fuleiro,\n");
	        office.append("Nós, do " + craftfloat.getToName() + ", convidamos o Vosso Capítulo para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftauto.getCraftDate() + "/" + craftauto.getCraftMonth() + "/" + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", Em nosso Capitulo, localizado na " + craftadress.getAdress() + ".\n");
	        office.append("Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
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


	
	
	


