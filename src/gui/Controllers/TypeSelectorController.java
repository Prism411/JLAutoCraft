package gui.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import entities.PlaceType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TypeSelectorController implements Initializable {

	@FXML
	private ComboBox<PlaceType> comboBox;

	@FXML
	private Button btSelect;

	@FXML
	private Button btReturn;
	
	private static PlaceType selectedPlaceType;
	
	
	public void setSelectedPlaceType(PlaceType selectedPlaceType) {
		TypeSelectorController.selectedPlaceType = selectedPlaceType;
	}
	
	public static PlaceType getSelectedPlaceType() {
		return selectedPlaceType;
	}

	public void onActionBtReturn() {
		try {
			AnchorPane newAnchorPane;
			newAnchorPane = FXMLLoader.load(getClass().getResource("/gui/MainMenuView.fxml"));
			Scene newScene = new Scene(newAnchorPane);
			Stage stage = (Stage) btReturn.getScene().getWindow();
			stage.setScene(newScene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void onActionBtSelect() {
		setSelectedPlaceType(comboBox.getValue());
		  if (selectedPlaceType == null) {
		    System.out.println("Selected value cannot be used.");
		  } else {
		    try {
		      FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/UserInputView.fxml"));
		      AnchorPane newAnchorPane = loader.load();
		      UserInputController userInputController = loader.getController();
		      if (userInputController != null) {
		        Scene newScene = new Scene(newAnchorPane);
		        Stage stage = (Stage) btSelect.getScene().getWindow();
		        stage.setScene(newScene);
		        stage.show();
		      } else {
		        System.out.println("UserInputController object is null.");
		      }
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		  }
		}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboBox.getItems().addAll(PlaceType.values());
		
	}

}
