package net.penguincoders.Sentiment;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import net.penguincoders.NLP;
import javafx.fxml.Initializable;

public class SentimentUIController implements Initializable
{
	static
	{
		NLP.initSentiment();
	}
	@FXML
	public TextArea inputText;
	@FXML
	public Button calculateScore;
	@FXML
	public Label scoreLabel;
	@FXML
	public URL location;
	@FXML
	public ResourceBundle resources;

	// Add a public no-args constructor
	public SentimentUIController() {
	}
	@FXML
	public void printLabelOutput() 
	{
		String input = inputText.getText();
		String score = NLP.findSentiment(input);
		scoreLabel.setText("Sentiment: "+score);
	}
	
	@FXML
	public void gotToPreviousScreen(ActionEvent event)throws Exception
	{
		((Node)event.getSource()).getScene().getWindow().hide();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../NLPUI.fxml"));
		Parent root = (Parent)loader.load(); 
		Stage output = new Stage();
		output.setTitle("Natural Language Processing");
		output.setScene(new Scene(root));
		output.show();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
}