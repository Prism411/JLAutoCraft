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
	private Button nextButton;
	
	@FXML
	private TextField textField;
	
	@FXML private Button previousButton;
	
	protected int count = 0;
	
	private String value = "";
	
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@FXML
	private void onBtPreviousAction() {
		if (count >= 0){
			count--;
		}
		Insert();		
	}
	
	private void Insert() {
	@SuppressWarnings("unused")
	String toName,toPlaceName,reason,meetingTime,dayCraft,monthCraft;
		switch (count) {
		case 0: 
		label.setText("Entre com o Nome do Lugar");
		toPlaceName = textField.getText();
		System.out.println(toPlaceName);
			break;
			
		case 1: 
		label.setText("Entre com o Nome do MC/VM/ETC..");
		toName = textField.getText();
		System.out.println(toName);
			break;
			
		case 2:
		label.setText("Entre com o Nome do assunto");
		reason = textField.getText();
		System.out.println(reason);
			break;
			
		case 3:
		label.setText("Entre com o horario da reunião");
		meetingTime = textField.getText();
		System.out.println(meetingTime);
			break;
			
		case 4: 
		label.setText("Entre com o dia da reunião");
		dayCraft = textField.getText();
		System.out.println(dayCraft);
			break;
		
		case 5: 
		label.setText("Entre com o mes da reunião");
		monthCraft = textField.getText();
		System.out.println(monthCraft);
			break;
		}
	}
	
	
	
	
	@FXML
	private void onBtNextAction() {
		if (count <= 5){
			count++;
		}
		Insert();
		
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		System.out.println(TypeSelectorController.getSelectedPlaceType());
		label.setText(getValue());
		PlaceTypelabel.setText("Place Type Selecionado = " + TypeSelectorController.getSelectedPlaceType());
		 label.setText("Entre com o Nome do Lugar");
		
	}



		
		
		


		

	}

		
	
