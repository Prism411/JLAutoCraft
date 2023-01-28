package services;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;

import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PlaceData;
import entities.PlaceType;

public class Loader {

	public static void writeCraftStatic(int managementNumber, String pccName, String escrvName, String mcName,
			String mcContact, String fromChapterName, String fromChapterNumber) {
		String path = "c:\\temp\\CraftStatic.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write(Integer.toString(managementNumber));
			bw.newLine();
			bw.write(pccName);
			bw.newLine();
			bw.write(escrvName);
			bw.newLine();
			bw.write(mcName);
			bw.newLine();
			bw.write(mcContact);
			bw.newLine();
			bw.write(fromChapterName);
			bw.newLine();
			bw.write(fromChapterNumber);
		} catch (IOException e) {
			System.out.println("ERRO IO EXCEPTION");
		}
	}

	public static void writeCraftFloat(PlaceType toplaceType, int toPlaceNumber, String toName, String toPlaceName,
			String reason, String meetingTime, String dayCraft, String monthCraft) {
		String path = "c:\\temp\\CraftFloat.txt";
		String toPlaceType = toplaceType.name();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write(toPlaceType);
			bw.newLine();
			bw.write(Integer.toString(toPlaceNumber));
			bw.newLine();
			bw.write(toName);
			bw.newLine();
			bw.write(toPlaceName);
			bw.newLine();
			bw.write(reason);
			bw.newLine();
			bw.write(meetingTime);
			bw.newLine();
			bw.write(dayCraft);
			bw.newLine();
			bw.write(monthCraft);
			bw.close();

		} catch (IOException e) {
			System.out.println("ERRO IO EXCEPTION");
		}
	}

	public static void WriteCraftAdress(String adress, String sponsorShop, int sponsorShopNumber) {
		String path = "c:\\temp\\CraftAdress.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write(adress);
			bw.newLine();
			bw.write(sponsorShop);
			bw.newLine();
			bw.write(Integer.toString(sponsorShopNumber));
		} catch (IOException e) {
			System.out.println("ERRO IO EXCEPTION");
		}
	}

	// AutoCraft Management
	public static void CreateTodayDate() throws IOException {

		// Obtém a data atual
		LocalDate dataAtual = LocalDate.now();

		// Obtém o nome do mês atual em português
		String mes = dataAtual.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

		// Caminho do arquivo
		String path = "c:\\temp\\CraftTodayDate.txt";

		// Cria o arquivo de texto
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));

		// Escreve a data no arquivo
		bw.write(dataAtual.getDayOfMonth() + ", " + mes + ", " + dataAtual.getYear());
		bw.newLine();
		bw.flush();
		bw.close();
	}

	public static void AddCraftNumber() throws IOException {
		// Abre o arquivo para leitura
		Scanner scanner = new Scanner(new File("c:\\temp\\CraftNumber.txt"));

		// Lê a primeira linha do arquivo
		String linha = scanner.nextLine();

		// Fecha o arquivo
		scanner.close();

		// Converte a string lida para inteiro
		int numero = Integer.parseInt(linha);

		// Adiciona 1 ao número
		numero++;

		// Escreve o novo número no arquivo
		FileWriter writer = new FileWriter("c:\\temp\\CraftNumber.txt");
		writer.write(Integer.toString(numero));
		writer.close();
	}

	public static void RemoveCraftNumber() throws IOException {
		// Abre o arquivo para leitura
		Scanner scanner = new Scanner(new File("c:\\temp\\CraftNumber.txt"));

		// Lê a primeira linha do arquivo
		String linha = scanner.nextLine();

		// Fecha o arquivo
		scanner.close();

		// Converte a string lida para inteiro
		int numero = Integer.parseInt(linha);

		// Adiciona 1 ao número
		numero--;

		// Escreve o novo número no arquivo
		FileWriter writer = new FileWriter("c:\\temp\\CraftNumber.txt");
		writer.write(Integer.toString(numero));
		writer.close();

	}
	// AutoCraft Management


}

