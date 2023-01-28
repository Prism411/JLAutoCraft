package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.PlaceData;
import entities.PlaceType;

public class PlaceDataHandler {
	
	  public static void CREATEToFile(PlaceType pT, int toPlaceNumber, String toPlaceName, String toName) {
	        try {
	            FileWriter fw = new FileWriter("c:\\temp\\PlaceData.txt", true); // "true" para adicionar ao arquivo existente
	            fw.write(pT + "," + toPlaceNumber + "," + toPlaceName + "," + toName + System.lineSeparator());
	            fw.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	  
	  public static List<PlaceData> READFromFile() {
	        List<PlaceData> placeDataList = new ArrayList<>();
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\PlaceData.txt"));
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");
	                PlaceType placeType = PlaceType.valueOf(data[0]);
	                int placeNumber = Integer.parseInt(data[1]);
	                String placeName = data[2];
	                String name = data[3];
	                PlaceData placeData = new PlaceData(placeType, placeNumber, placeName, name);
	                placeDataList.add(placeData);
	            }
	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return placeDataList;
	    }


//Essa função irá substituir qualquer conteúdo existente no arquivo "c:\temp\PlaceData.txt" com os dados da lista 
//passada como parâmetro. Certifique-se de passar o caminho correto do arquivo e as informações corretas da lista.

public static void WRITEListToFile(List<PlaceData> placeDataList) {
    try {
        FileWriter fw = new FileWriter("c:\\temp\\PlaceData.txt");
        for (PlaceData placeData : placeDataList) {
            fw.write(placeData.getpT() + "," + placeData.getToPlaceNumber() + "," + placeData.getToPlaceName() + "," + placeData.getToName() + System.lineSeparator());
        }
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}


//Breve tutorial de como usar:

//adiciona essa linha lá
		//PlaceDataHandler.CREATEToFile(PlaceType.CAPITULO, 3, "oi", "oi");
		
		//cria a lista para USO
		//List<PlaceData> list = PlaceDataHandler.READFromFile();
		//faz alteração X
		//list.remove(0);
		//salva possiveis alterações na lista
		//PlaceDataHandler.WRITEListToFile(list);

	  





