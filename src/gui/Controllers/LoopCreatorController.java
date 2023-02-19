package gui.Controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import entities.PlaceData;
import entities.PlaceType;
import gui.util.Alerts;
import gui.util.Constraints;
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
	
	
	public void getInput(String placeName, String placePerson,String reason,String meetingTime,String day,String month, int placeNumber) {
			placeName = inputPlaceName.getText();
			placeNumber = Integer.parseInt(inputPlaceNumber.getText());
			placePerson = inputPlacePerson.getText();
			reason = inputReason.getText();
			meetingTime = inputMeetingTime.getText();
			day = inputDay.getText();
			month = inputMonth.getText();
			labelShowResult.setText(String.format("Nome do lugar: %s\n\n\nNumero do Lugar %d\n\n\nNome da Pessoa: %s\n\n\nAssunto:"
					+ " %s\n\n\nHorario: %s\n\n\nDia: %s\n\n\nMês: %s",placeName,placeNumber,placePerson,reason,meetingTime,day,month));			
	}
	
	public void onComboBoxAction() {
		PlaceData selectedPlaceData = list.getValue(); 
		//setToName(selectedPlaceData.getToName());
		//setToPlaceNumber(selectedPlaceData.getToPlaceNumber());
		//setToPlaceName(selectedPlaceData.getToPlaceName());
		//setSelectedPlaceType(selectedPlaceData.getpT());
		inputPlaceName.setText(selectedPlaceData.getToPlaceName());
		inputPlaceNumber.setText(String.format("%d",getToPlaceNumber()));
		inputPlacePerson.setText(selectedPlaceData.getToName());
		inputReason.setText("Reunião Ritualística: ");
		inputMeetingTime.setText("15:30");
		setSelectedPlaceType(selectedPlaceData.getpT());
		boxPlaceType.setValue(getSelectedPlaceType());
		
		
		
	}
	
	public void onbtCreateCraftAction() { //cria o oficio 
	String placeName = "",placePerson= "",reason= "",meetingTime= "",day= "",month= "";
	int placeNumber = 0;
	

		setSelectedPlaceType(boxPlaceType.getValue());
		if (selectedPlaceType != null) {               
			getInput(placeName,placePerson,reason,meetingTime,day,month,placeNumber);
			}		else {                       
	//se selectedPlaceType for NULO emite um aviso!
				Alerts.showAlert("Alerta","UM ERRO FOI ENCONTRADO!", "Voce Precisa Selecionar um PlaceType!", AlertType.ERROR);
			}	
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	List<PlaceData> lista = PlaceDataHandler.READFromFile();
	list.getItems().addAll(lista);
	boxPlaceType.getItems().addAll(PlaceType.values());
	Constraints.setTextFieldDouble(inputPlaceNumber);
	}
	
	//Alerts.showAlert("AlertTitle",null, "Click", AlertType.INFORMATION);
	 //titulo, //cabeçalho //mensagem // tipo
	

}
