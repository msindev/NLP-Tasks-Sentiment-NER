package net.penguincoders;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NLPUIController 
{
	@FXML
	public Button sentimentAnalysisButton;
	
	@FXML
	public Button NERButton;
	
	@FXML
	public void sentimentAnalysis(ActionEvent event)throws Exception
	{
		((Node)event.getSource()).getScene().getWindow().hide();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Sentiment/SentimentUI.fxml"));
		Parent root = (Parent)loader.load();
		Stage output = new Stage();
		output.setTitle("Sentiment Analysis");
		output.setScene(new Scene(root));
		output.show();
	}
	
	public void NER(ActionEvent event)throws Exception
	{
		((Node)event.getSource()).getScene().getWindow().hide();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("NER/NERUI.fxml"));
		Parent root = (Parent)loader.load();
		Stage output = new Stage();
		output.setTitle("Named Entity Recognition");
		output.setScene(new Scene(root));
		output.show();
	}
}
