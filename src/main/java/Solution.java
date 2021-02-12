import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import java.awt.*;


public class Solution extends Application{

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ScenaFXML.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("StyleCSS.css").toExternalForm());
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Menu Access");
        stage.show();
    }
}
