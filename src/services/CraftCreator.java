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
		
		case CAPITULO: System.out.println("MODO CAPITULO SELECIONADO");
		writeToCAPITULOcraft(craftfloat,craftadress,craftstatic,craftauto);
			break;
			
		case LOJA: System.out.println("loja");
		writeToLojacraft(craftfloat,craftadress,craftstatic,craftauto);
		break;
		
		case BETHEL: System.out.println("bethel");
		writeToBethelcraft(craftfloat,craftadress,craftstatic,craftauto);
		break;
		
		case PESSOA: System.out.println("PESSOA SELECIONADO");
		writeToPerson(craftfloat,craftadress,craftstatic,craftauto);
		}
	}
	

	    public static void writeToCAPITULOcraft(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + ".2" + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append("o Senhor,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Mestre Conselheiro,\n");
	        office.append(craftfloat.getToPlaceName() + " nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Queridíssimo Mestre Conselheiro,\n");
	        office.append("           Nós, do " + craftfloat.getToName() + ", convidamos o Vosso Capítulo para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out.txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    public static void writeToBethelcraft(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + ".2" + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Honorável Rainha,\n");
	        office.append(craftfloat.getToPlaceName() + " nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Querida Prima,\n");
	        office.append("           Nós, do " + craftfloat.getToName() + ", convidamos o Vosso Bethel para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out.txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    public static void writeToLojacraft(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + ".2" + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append("Ao Ilustríssimo Senhor,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Venerável Mestre,\n");
	        office.append(craftfloat.getToPlaceName() + " nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Querido Tio,\n");
	        office.append("           Nós, do " + craftfloat.getToName() + ", convidamos a Vossa Loja para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out.txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    public static void writeToPerson(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + ".2" + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Querido "+craftfloat.getToName()+",\n");
	        office.append("           Nós, do " + craftfloat.getToName() + ", convidamos a Vossa Pessoa para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão Mestre Conselheiro do Capítulo " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out.txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    
	}


	
	
	


