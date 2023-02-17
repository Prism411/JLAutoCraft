package gui.Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import entities.PlaceData;
import entities.PlaceType;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
	//
	@FXML private Label labelShowResult;
	
	
	public void getInput() {
		String placeName,placePerson,reason,meetingTime,day,month;
		int placeNumber;
		placeName = inputPlaceName.getText();
		placeNumber = Integer.parseInt(inputPlaceNumber.getText());
		placePerson = inputPlacePerson.getText();
		reason = inputReason.getText();
		meetingTime = inputMeetingTime.getText();
		day = inputDay.getText();
		month = inputMonth.getText();
		labelShowResult.setText(String.format("Nome do lugar: %s\n\nNumero do Lugar %d\n\nNome da Pessoa: %s\n\nAssunto: %s\n\nHorario: %s\n\nDia: %s\n\nMês: %s",placeName,placeNumber,placePerson,reason,meetingTime,day,month));
		
	}
	
	public void onbtCreateCraftAction() { //cria o oficio 
	PlaceData selectedPlaceData;
	
	selectedPlaceData = list.getValue();
	if (selectedPlaceData == null) { //                primeiro IF
		//então o programa correrá normalmente!
		setSelectedPlaceType(boxPlaceType.getValue());
		if (selectedPlaceType != null) {               //Segundo IF
			getInput();
			}		else {                           //Segundo IF
	//se selectedPlaceType for NULO emite um aviso!
				Alerts.showAlert("Alerta","UM ERRO FOI ENCONTRADO!", "Voce Precisa Selecionar um PlaceType!", AlertType.ERROR);
			}
	
	} else {                                          // primeiro IF
		//MODO AUTOMATICO!! 
		System.out.println(selectedPlaceData.getToName());
		System.out.println(selectedPlaceData.getToPlaceName());
		System.out.println(selectedPlaceData.getToPlaceNumber());
		System.out.println(selectedPlaceData.getpT());
		System.out.println(selectedPlaceData.toString());
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	List<PlaceData> lista = PlaceDataHandler.READFromFile();
	for (PlaceData placedata : lista) {
		System.out.println(lista);
	}
	list.getItems().addAll(lista);
	boxPlaceType.getItems().addAll(PlaceType.values());
		
	}
	
	//Alerts.showAlert("AlertTitle",null, "Click", AlertType.INFORMATION);
	 //titulo, //cabeçalho //mensagem // tipo
	

}
