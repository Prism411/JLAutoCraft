package gui.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import entities.PlaceType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class TypeSelectorController implements Initializable {
	
	@FXML
	private ComboBox<PlaceType> comboBox;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboBox.getItems().addAll(PlaceType.values());
		
	}

}
