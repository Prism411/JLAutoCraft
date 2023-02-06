package gui.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import entities.PlaceType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import services.CraftCreator;

public class UserInputController implements Initializable {
	
	@FXML
	private Label label;
	
	@FXML private Label PlaceTypelabel;
	
	@FXML
	private Button nextButton;
	
	@FXML
	private TextField textField;
	
	@FXML private Button previousButton;
	
	@FXML private Label resultLabel;
	
	protected int number;
	protected int count = number;
	
	private String value = "";
	
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@FXML
	private void onBtPreviousAction() {
		count = number;
		label.setText("Entre com o Nome do lugar");
		Insert();		
	}
	
	@FXML
	private void onBtNextAction() {
		if (count <= 8){
			count++;
		}
		Insert();
		
	}

	private static String toName = "",toPlaceName= "",reason= "",meetingTime= "",dayCraft= "",monthCraft= "";
	private static int toPlaceNumber = 0;
	private void Insert() {
		
	try {
		switch (count) {
		case 0: 
		label.setText("Entre com o Numero do lugar");
		toPlaceName = textField.getText();
		System.out.println(toPlaceName);
			break;
		case 1: 
		label.setText("Entre com o Nome do MC/VM/ETC..");
		toPlaceNumber = Integer.parseInt(textField.getText());
		System.out.println(toPlaceNumber);
		break;
			
		case 2: 
		label.setText("Entre com o Nome do assunto");
		toName = textField.getText();
		System.out.println(toName);
		break;
			
		case 3:
		label.setText("Entre com o horario da reunião");
		reason = textField.getText();
		System.out.println(reason);
		break;
			
		case 4:
		label.setText("Entre com o dia da reunião");
		meetingTime = textField.getText();
		System.out.println(meetingTime);
		break;
			
		case 5: 
		label.setText("Entre com o mes da reunião");
		dayCraft = textField.getText();
		System.out.println(dayCraft);
		break;
		case 6: 
		label.setText("Clique Next Para continuar!");
		monthCraft = textField.getText();
		System.out.println(monthCraft);
		break;
		case 7: 
			label.setText("Voce deseja criar um oficio com essas informações?");
			resultLabel.setText(String.format("Nome do lugar: %s\nNumero do Lugar: %d\nNome do MC/VM/P/HR: %s\nAssunto: %s\nHorario: %s\nDia: %s\nMês: %s", toPlaceName, toPlaceNumber, toName,reason, meetingTime, dayCraft, monthCraft));
			break;
		
		case 8: CraftCreator.UserCraftCreator(TypeSelectorController.getSelectedPlaceType(), toPlaceNumber, toName, toPlaceName, reason, meetingTime, dayCraft, monthCraft); break;
		}
	}catch(NumberFormatException e) {
		e.printStackTrace();
		toPlaceNumber = 1;
	}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		System.out.println(TypeSelectorController.getSelectedPlaceType());
		label.setText(getValue());
		PlaceTypelabel.setText("Place Type Selecionado = " + TypeSelectorController.getSelectedPlaceType());
		 label.setText("Entre com o Nome do Lugar");
		 number = -1;
		 count = number;
	if (TypeSelectorController.getSelectedPlaceType() == PlaceType.PESSOA) {
		number = 1;
		count = number;
		Insert();
	}

	
	}



		
		
		


		

	}

		
	
