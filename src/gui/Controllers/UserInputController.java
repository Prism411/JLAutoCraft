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
		switch (count) {
		case 0: System.out.println("teste");
			break;
			
		case 1: System.out.println("teste2");
			break;
			
		case 2: System.out.println("teste3");
			break;
			
		case 3: System.out.println("teste4");
			break;
			
		case 4: System.out.println("teste5");
			break;
		
		case 5: System.out.println("teste6");
			break;
			
		case 6: System.out.println("teste7");
			break;
		}
	}
	
	
	
	
	@FXML
	private void onBtNextAction() {
		if (count <= 6){
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

		
	
