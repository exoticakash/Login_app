package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 900, 400));
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream( "icons/badoo.png" )));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
