package gui.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import services.CraftCreator;

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
