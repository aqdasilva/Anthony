package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {

    public static void main(String[] args){launch(args);}
    @Override
    public void start(Stage primaryStage){
        Parent root = null;
        var loc = getClass().getResource("Main.fxml");
        try {
            root = FXMLLoader.load(loc);
        }catch (IOException x){
            System.out.println("Could not find the file , you were seeking");
        }
        Scene windowContents = new Scene(root,300,400);
        primaryStage.setScene(windowContents);
        primaryStage.setTitle("Showing the sites data");
        primaryStage.show();
    }
}



