package net.penguincoders.NER;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreEntityMention;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import net.penguincoders.NLP;

public class NERUIController implements Initializable
{
	static
	{
		NLP.initNER();
	}
	
	@FXML
	public TextArea inputText;
	
	@FXML
	public Button extractKeyword;
	
	@FXML
	public BorderPane outputPane;
	@FXML
	public void goToOutputScreen(ActionEvent event) throws IOException
	{
		((Node)event.getSource()).getScene().getWindow().hide();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("NEROutput.fxml"));
		Parent root = (Parent)loader.load(); 
		NEROutputController neroc = loader.getController();
		//neroc.setPersonLabel("Hello Person 1");
		CoreDocument doc = NLP.namedEntityRecognition(inputText.getText());
		String person="",organization="",location="";
		for (CoreEntityMention em : doc.entityMentions())
		{
			if(em.entityType().equalsIgnoreCase("PERSON"))
				person += em.text()+"\n";
			if(em.entityType().equalsIgnoreCase("ORGANIZATION"))
				organization+=em.text()+"\n";
			if(em.entityType().equalsIgnoreCase("LOCATION") || em.entityType().equalsIgnoreCase("COUNTRY"))
				location+=em.text()+"\n";
		}
		neroc.setPersonLabel(person);
		neroc.setLocationLabel(location);
		neroc.setOrganizationLabel(organization);
		Stage output = new Stage();
		output.setTitle("Named Entity Recognition");
		output.setScene(new Scene(root));
		output.show();
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
