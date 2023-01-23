package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

import entities.PlaceType;

public class Loader {
	public static void writeData(int managementNumber, int craftNumber, PlaceType placeType, String toCraftName,
			String mcName, String mcContact, int craftYear, String placeName) {
		String path = "c:\\temp\\in.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write(Integer.toString(managementNumber));
			bw.newLine();
			bw.write(Integer.toString(craftNumber));
			bw.newLine();
			bw.write(placeType.toString());
			bw.newLine();
			bw.write(toCraftName);
			bw.newLine();
			bw.write(mcName);
			bw.newLine();
			bw.write(mcContact);
			bw.newLine();
			bw.write(Integer.toString(craftYear));
			bw.newLine();
			bw.write(placeName);
		} catch (IOException e) {
			System.out.println("ERRO IO EXCEPTION");
		}
	}

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
}

