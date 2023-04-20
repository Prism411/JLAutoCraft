package gui.Controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import services.CraftCreator;
import services.Loader;

public class ConfirmController implements Initializable {
	
	private static int craftCounter;
	public static int getCraftCounter() {
		return craftCounter;
	}
	public static void setCraftCounter(int craftCounter) {
		ConfirmController.craftCounter = craftCounter;
	}
			

	@FXML Label craftCounterLabel;
	@FXML Label namePlaceLabel;
	@FXML Label numberPlace;
	@FXML Label mcNamePlace;
	@FXML Label reason;
	@FXML Label day;
	@FXML Label month;
	
	@FXML Button btDelete;
	@FXML Button btCreate;
	
	public void Close() {
		Stage currentStage = (Stage) btCreate.getScene().getWindow();
	    currentStage.close();
	}
	
	public void onBtCreateAction() {
	    Close();
		}
	
	public void onBtDeleteAction() {
	try {
		File file = new File("c:\\temp\\out"+getCraftCounter()+".txt");
		if(file.delete()){
			Alerts.showAlert("SUCESSO!","","O Oficio" +getCraftCounter() + " Foi Excluido! ", AlertType.INFORMATION);
		    System.out.println(file.getName() + " is deleted!");
		    Loader.RemoveCraftNumber();
		}else{
			Alerts.showAlert("ERRO!", "ERRO ENCONTRADO!","NAO FOI POSSIVEL EXCLUIR", AlertType.ERROR);
		    System.out.println("Delete operation is failed."); 
		}
		 Close();
	} 
	
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	 void createCraft(){

			CraftCreator.UserCraftCreator(LoopCreatorController.getSelectedPlaceType(), LoopCreatorController.getToPlaceNumber(), 
					LoopCreatorController.getToName(),LoopCreatorController.getToPlaceName(), LoopCreatorController.getReason(), 
					LoopCreatorController.getMeetingTime(), LoopCreatorController.getDayCraft(), LoopCreatorController.getMonthCraft());
	 }
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		namePlaceLabel.setText(LoopCreatorController.getToPlaceName());
		numberPlace.setText(String.format("%d",LoopCreatorController.getToPlaceNumber()));
		mcNamePlace.setText(LoopCreatorController.getToName());
		reason.setText(LoopCreatorController.getReason());
		day.setText(LoopCreatorController.getDayCraft());
		month.setText(LoopCreatorController.getMonthCraft());
		createCraft();
		craftCounterLabel.setText(String.format("Ofício Número: \"%d\" foi Criado!", getCraftCounter()));
		
		
	}

}
