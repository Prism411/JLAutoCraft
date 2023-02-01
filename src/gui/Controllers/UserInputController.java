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
	
	@FXML
	private Label label;
	
	@FXML private Label PlaceTypelabel;
	
	@FXML
	private Button button;
	
	@FXML
	private TextField textField;
	
	private String value = "";
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@FXML
	private void onBtAction() {
		 setValue(textField.getText());
	    System.out.println(getValue());
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println(TypeSelectorController.getSelectedPlaceType());
		label.setText(getValue());
		PlaceTypelabel.setText("Place Type Selecionado = " + TypeSelectorController.getSelectedPlaceType());
		
	}



		
		
		


		

	}

		
	
