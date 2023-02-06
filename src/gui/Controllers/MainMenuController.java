package gui.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainMenuController implements Initializable{

	@FXML
	private Button bt1; //Criar um Oficio a partir do banco de dados
	@FXML
	private Button bt2; //Criar Oficio do Zero
	@FXML
	private Button bt3; //Mudar Loja Patrocinadora
	@FXML
	private Button bt4; //Mudar dados da gestão
	@FXML
	private Button bt5; //Adicionar no Banco de Dados
	@FXML
	private Button bt6; //Remover do banco de dados
	@FXML
	private Button bt7;  //Sair do Aplicativo
	
	public void onBt2Action() {
		try {
		    AnchorPane newAnchorPane = FXMLLoader.load(getClass().getResource("/gui/TypeSelector.fxml"));
		    Scene newScene = new Scene(newAnchorPane);
		    Stage stage = (Stage) bt2.getScene().getWindow();
		    stage.setScene(newScene);
		    stage.show();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public void onBt1Action() {
		try {
		    AnchorPane newAnchorPane = FXMLLoader.load(getClass().getResource("/gui/LoopCreatorView.fxml"));
		    Scene newScene = new Scene(newAnchorPane);
		    Stage stage = (Stage) bt1.getScene().getWindow();
		    stage.setScene(newScene);
		    stage.show();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
