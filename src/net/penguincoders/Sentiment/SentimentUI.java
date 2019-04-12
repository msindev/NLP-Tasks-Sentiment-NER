package net.penguincoders.Sentiment;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SentimentUI extends Application 
{
	@Override
	public void start(Stage stage) throws Exception
	{
		//Create the FXMLLoader
		FXMLLoader loader = new FXMLLoader();
		//SentimentUIController controller = new SentimentUIController();
		//loader.setController(controller);
		//Path to FXML File
		String fxmlPath = "src/net/penguincoders/Sentiment/SentimentUI.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlPath);
		//Parent root = FXMLLoader.load(getClass().getResource("src/net/penguincoders/Sentiment/SentimentUI.fxml"));
		//Create the pane and load all details
		Pane root = (Pane) loader.load(fxmlStream);
		//Create the scene
		Scene scene = new Scene(root);
		//Set the scene to the stage
		stage.setScene(scene);
		stage.setTitle("Sentiment Analysis");
		stage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
		//System.out.println("Done executing.");
	}
}
