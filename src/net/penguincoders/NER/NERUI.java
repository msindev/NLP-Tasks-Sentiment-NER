package net.penguincoders.NER;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NERUI extends Application
{

	@Override
	public void start(Stage stage) throws Exception
	{
		//Create the FXMLLoader
		FXMLLoader loader = new FXMLLoader();
		//NERUIController controller = new NERUIController();
		//loader.setController(controller);
		//Path to FXML File
		String fxmlPath = "src/net/penguincoders/NER/NERUI.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlPath);
		//Create the pane and load all details
		Pane root = (Pane) loader.load(fxmlStream);
		//Create the scene
		Scene scene = new Scene(root);
		//Set the scene to the stage
		stage.setScene(scene);
		stage.setTitle("Named Entity Recognition");
		stage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
		//System.out.println("Done executing.");
	}

}
