package gui.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import entities.PlaceType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UserInputController implements Initializable {

	private static PlaceType selectedPlaceType;
	
	

	public static void setSelectedPlaceType(PlaceType selectedPlaceType) {
		UserInputController.selectedPlaceType = selectedPlaceType;
	}
	
	public static PlaceType getSelectedPlaceType() {
		return selectedPlaceType;
	}
	
	@FXML
	private Label label;
	
	@FXML private Label PlaceTypelabel;
	
	@FXML
	private Button button;
	
	@FXML
	private TextField textField;
	
	private String value = "testeee";
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@FXML
	private void handleTextFieldAction() {

	}
	
	@FXML
	private void onBtAction() {
		 setValue(textField.getText());
	    System.out.println(getValue());
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		label.setText(getValue());
	}



		
		
		


		

	}

		
	
