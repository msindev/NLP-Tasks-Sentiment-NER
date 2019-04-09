package net.penguincoders.NER;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
	
	
	public void printKeyword()
	{
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
