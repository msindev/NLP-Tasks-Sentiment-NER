package net.penguincoders.NER;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NEROutputController implements Initializable
{

	@FXML
	Label personLabel;
	
	@FXML
	Label locationLabel;
	
	@FXML
	Label organizationLabel;
	
	@FXML
	Button backButton;
	
	public void setPersonLabel(String input)
	{
		personLabel.setText(input);
	}
	
	public void setLocationLabel(String input)
	{
		locationLabel.setText(input);
	}
	
	public void setOrganizationLabel(String input)
	{
		organizationLabel.setText(input);
	}
	
	@FXML
	public void gotToPreviousScreen(ActionEvent event)throws Exception
	{
		((Node)event.getSource()).getScene().getWindow().hide();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("NERUI.fxml"));
		Parent root = (Parent)loader.load(); 
		Stage output = new Stage();
		output.setTitle("Named Entity Recognition");
		output.setScene(new Scene(root));
		output.show();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
