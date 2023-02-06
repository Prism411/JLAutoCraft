package gui.Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import entities.PlaceData;
import entities.PlaceType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import services.PlaceDataHandler;

public class LoopCreatorController implements Initializable {
	
	private static String toName = "",toPlaceName= "",reason= "",meetingTime= "",dayCraft= "",monthCraft= "";
	private static int toPlaceNumber = 0;
	private static PlaceType selectedPlaceType;
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		LoopCreatorController.toName = toName;
	}
	public String getToPlaceName() {
		return toPlaceName;
	}
	public void setToPlaceName(String toPlaceName) {
		LoopCreatorController.toPlaceName = toPlaceName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		LoopCreatorController.reason = reason;
	}
	public String getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(String meetingTime) {
		LoopCreatorController.meetingTime = meetingTime;
	}
	public String getDayCraft() {
		return dayCraft;
	}
	public void setDayCraft(String dayCraft) {
		LoopCreatorController.dayCraft = dayCraft;
	}
	public String getMonthCraft() {
		return monthCraft;
	}
	public void setMonthCraft(String monthCraft) {
		LoopCreatorController.monthCraft = monthCraft;
	}
	public int getToPlaceNumber() {
		return toPlaceNumber;
	}
	public void setToPlaceNumber(int toPlaceNumber) {
		LoopCreatorController.toPlaceNumber = toPlaceNumber;
	}


	public void setSelectedPlaceType(PlaceType selectedPlaceType) {
		LoopCreatorController.selectedPlaceType = selectedPlaceType;
	}
	public static PlaceType getSelectedPlaceType() {
		return selectedPlaceType;
	}
	
	@SuppressWarnings("unused")
	@FXML private Button btCreateCraft; // ao apertar este botão o oficio é criado
	
	//declaracao de textfields.
	
	@FXML private TextField inputPlaceName;
	
	@FXML private TextField inputPlaceNumber;
	
	@FXML private TextField inputPlacePerson; //nome da pessoa que está na liderança do capitulo, bethel.. etc...
	
	@FXML private TextField inputReason;
	
	@FXML private TextField inputMeetingTime; //horario da reunião
	
	@FXML private TextField inputDay; // dia da reunião 
	
	@FXML private TextField inputMonth; // mes da reunião
	
	//declaracao das comboBoxes
	
	@FXML private ComboBox<PlaceType> boxPlaceType;
	
	@FXML private ComboBox<PlaceData> list;
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	List<PlaceData> lista = PlaceDataHandler.READFromFile();
	for (PlaceData placedata : lista) {
		System.out.println(lista);
	}
	list.getItems().addAll(lista);
	boxPlaceType.getItems().addAll(PlaceType.values());
		
	}
	

}