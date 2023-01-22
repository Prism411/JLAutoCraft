package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entities.PlaceType;

public class Loader {
	    public static void writeData(int managementNumber, int craftNumber, PlaceType placeType, String toCraftName, String mcName, String mcContact, int craftYear, String placeName) {
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
	}


