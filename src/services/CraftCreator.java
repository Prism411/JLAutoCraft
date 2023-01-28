package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
		break;
		
		case LodgePerm:
			PermissionToLodge(craftfloat,craftadress,craftstatic,craftauto);
			break;
		}
	}
	

	    public static void writeToCAPITULOcraft(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + "." + craftstatic.getManagementNumber() + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append("o Senhor,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Mestre Conselheiro,\n");
	        office.append(craftfloat.getToPlaceName() + " nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Queridíssimo Mestre Conselheiro,\n");
	        office.append("           Nós, do " + craftstatic.getFromChapterName() + ", convidamos o Vosso Capítulo para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftfloat.getDayCraft() + " de " + craftfloat.getMonthCraft() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão Mestre Conselheiro do Capítulo " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out"+craftauto.getCraftNumber()+".txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    public static void writeToBethelcraft(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + "." + craftstatic.getManagementNumber() + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Honorável Rainha,\n");
	        office.append(craftfloat.getToPlaceName() + " nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Querida Prima,\n");
	        office.append("           Nós, do " + craftstatic.getFromChapterName() + ", convidamos o Vosso Bethel para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftfloat.getDayCraft() + " de " + craftfloat.getMonthCraft() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão Mestre Conselheiro do Capítulo " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out"+craftauto.getCraftNumber()+".txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    public static void writeToLojacraft(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + "." + craftstatic.getManagementNumber() + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append("Ao Ilustríssimo Senhor,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Venerável Mestre,\n");
	        office.append(craftfloat.getToPlaceName() + " nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Querido Tio,\n");
	        office.append("           Nós, do " + craftstatic.getFromChapterName() + ", convidamos a Vossa Loja para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftfloat.getDayCraft() + " de " + craftfloat.getMonthCraft() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união e o amor fraternal podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão Mestre Conselheiro do Capítulo " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcName() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out"+craftauto.getCraftNumber()+".txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    public static void writeToPerson(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	        StringBuilder office = new StringBuilder();
	        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + "." + craftstatic.getManagementNumber() + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
	        office.append("À Vossa Senhoria,\n");
	        office.append(craftfloat.getToName() + ",\n");
	        office.append("Porto Velho, Rondônia.\n\n");
	        office.append(String.format("%65s%s\n\n", "Assunto: ", craftfloat.getReason()));
	        office.append("           Querido "+craftfloat.getToName()+",\n");
	        office.append("           Nós, do " + craftfloat.getToName() + ", convidamos a Vossa Pessoa para a nossa Reunião Ritualística com a seguinte pauta: " + craftfloat.getReason() + ". Ocorrerá no dia " + craftfloat.getDayCraft() + " de " + craftfloat.getMonthCraft() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
	        office.append("           Sua presença é de suma importância para nós, visto que com a união podemos construir laços e fazer deste um mundo melhor para se viver.\n");
	        office.append("Para quaisquer dúvidas, contatem o Irmão Mestre Conselheiro do Capítulo " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcContact() + ").\n");
	        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
	        office.append("           Fraternalmente,\n\n\n");
	        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
	        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
	        office.append("                                              " +  craftstatic.getPccName() + "\n");
	        office.append("                                   Presidente do Conselho Consultivo                             ");
	    
	        System.out.println(office.toString());
	    
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out"+craftauto.getCraftNumber()+".txt"))) {
	            bw.write(office.toString());
	        } catch (IOException e) {
	            System.out.println("ERRO IO EXCEPTION");
	        }
	    }
	    
	    public static void PermissionToLodge(CraftFloat craftfloat,craftAdress craftadress, CraftStatic craftstatic, CraftAuto craftauto) {
	    	 StringBuilder office = new StringBuilder();
		        office.append("Ofício nº " + craftauto.getCraftNumber() + "/" + craftauto.getCraftYear() + "." + craftstatic.getManagementNumber() + " Porto Velho, " + craftauto.getCraftDate() + " de " + craftauto.getCraftMonth() + " de " + craftauto.getCraftYear() + "\n");
		        office.append("À Vossa Senhoria,\n");
		        office.append("Ao Ilustrissimo Senhor,\n");
		        office.append(craftfloat.getToName() + ",\n");
		        office.append("Venerável Mestre,\n");
		        office.append(craftfloat.getToPlaceName() + " nº " + craftfloat.getToPlaceNumber() + ", Porto Velho, Rondônia.\n\n");
		        office.append("\t\t\t\t\t\t\tAssunto: Informativo quanto à Reunião Ritualística.\n");
		        office.append("           Ao Ilustrissimo Senhor "+ craftfloat.getToName() + " Venerável Mestre \n");
		        office.append("           Nós, do Capitulo" + craftstatic.getFromChapterName() + ", vimos por meio deste informar à vossa senhoria que o Capítulo irá utilizar a loja das "+ craftfloat.getMeetingTime() + " às 21:00, por conta das seguintes pautas: " + craftfloat.getReason() + ". Que ocorrerão no dia " + craftfloat.getDayCraft() + " de " + craftfloat.getMonthCraft() + " de " + craftauto.getCraftYear() + ", às " + craftfloat.getMeetingTime() + ", na Loja Maçônica "+ craftadress.getSponsorShop()+ " nº " + craftadress.getSponsorShopNumber() + ", localizado na " + craftadress.getAdress() + ".\n");
		        office.append("           Sua presença é de suma importância para nós, visto que com a união podemos construir laços e fazer deste um mundo melhor para se viver.\n");
		        office.append("Para quaisquer dúvidas, contatem o Irmão Mestre Conselheiro do Capítulo " + craftstatic.getMcName() + ". (Contato: " + craftstatic.getMcContact() + ").\n");
		        office.append("           Sendo isso para o momento, aproveitamos para reiterar as afirmações da mais elevada estima e distinta consideração.\n");
		        office.append("           Fraternalmente,\n\n\n");
		        office.append("   " + craftstatic.getMcName()+"                                                                               "+craftstatic.getEscrvName()+"\n");
		        office.append("  Mestre Conselheiro                                                                                Escrivão\n\n\n");
		        office.append("                                              " +  craftstatic.getPccName() + "\n");
		        office.append("                                   Presidente do Conselho Consultivo                             ");
		    
		        System.out.println(office.toString());
		    
		        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out"+craftauto.getCraftNumber()+".txt"))) {
		            bw.write(office.toString());
		        } catch (IOException e) {
		            System.out.println("ERRO IO EXCEPTION");
		        }
		    }
	    
		public static void UserCraftCreator(PlaceType toplaceType, int toPlaceNumber, String toName, String toPlaceName, String reason,
				String meetingTime, String dayCraft, String monthCraft, Scanner sc) {
			try {
			CraftFloat cF = Reader.ReadFloatData(); //le os valores do oficio float
			craftAdress cA = Reader.readCraftAdress(); //le os valores do endereço
			Loader.AddCraftNumber();
			CraftAuto a = Reader.ReadAutoData(); //le os valores do oficio automatizado
			CraftStatic cS = Reader.ReadStaticData(); //le os valores do oficio estatico
			
			Loader.writeCraftFloat(toplaceType,toPlaceNumber,toName,toPlaceName,reason,meetingTime,dayCraft,monthCraft); 
			cF = Reader.ReadFloatData();
			CraftCreator.CraftCreate(cF, cA, cS, a); //cria e escreve o oficio
			System.out.println("OFICIO nº"+ a.getCraftNumber()+" Criado!");
			System.out.printf("1-Deseja criar um novo oficio?\n2-Deseja deletar este oficio?");
			int opcao = sc.nextInt();
			sc.nextLine();
			switch(opcao) {
			case 1:  CraftChangeFloat(toplaceType,toPlaceNumber,toName,toPlaceName,reason,meetingTime,dayCraft,monthCraft,sc);
				break;
				
			case 2: 
				File file = new File("c:\\temp\\out"+a.getCraftNumber()+".txt");
				if(file.delete()){
				    System.out.println(file.getName() + " is deleted!");
				}else{
				    System.out.println("Delete operation is failed.");
				}
			Loader.RemoveCraftNumber();
			break;
			}
			
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		public static void CraftChangeFloat(PlaceType toplaceType, int toPlaceNumber, String toName, String toPlaceName, String reason,
				String meetingTime, String dayCraft, String monthCraft, Scanner sc) {
			char opcao;
			System.out.println("Deseja Mudar algo? (s/n)");
			opcao = sc.nextLine().charAt(0);
			if (opcao == 's') {
			int choice = 0;
			while (choice != 9) {
			System.out.println("O que deseja Mudar?");
			System.out.printf("\n1-Mudar Tipo\n2-Mudar Nome do Local\n3-Mudar Numero do Local\n4-Mudar Nome do MC/VM/PESSOA"
			+ "\n5-Mudar Assunto da Reunião\n6-Mudar Horario da Reunião\n7-Mudar Dia da Reunião\n8-Mudar Mês\n9-Criar Oficio\n10-Parar");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: toplaceType = PlaceType.valueOf(CraftMenu.ChangeTo(choice,sc)); break;
			case 2: toPlaceName = CraftMenu.toPName(sc); 
			case 3: toPlaceNumber =  CraftMenu.toPNumber(sc); break;
			case 4: toName = CraftMenu.ChangeTo(choice,sc); break;
			case 5: reason = CraftMenu.ChangeTo(choice,sc); break;
			case 6: meetingTime = CraftMenu.ChangeTo(choice,sc); break;
			case 7: dayCraft = CraftMenu.ChangeTo(choice,sc); break;
			case 8: monthCraft = CraftMenu.ChangeTo(choice,sc); break;
			case 9: System.out.println("Oficio Criado!");
				UserCraftCreator(toplaceType,toPlaceNumber,toName,toPlaceName,reason,meetingTime,dayCraft,monthCraft, sc); break;

			}
			}
				
			
			
			
			
			
			
				

			} else {UserCraftCreator(toplaceType, toPlaceNumber, toName, toPlaceName, reason, meetingTime, dayCraft, monthCraft, sc);	
			}
			
		}
		

	    
	    
	}


	
	
	


