import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class Solution extends Application{

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ScenaFXML.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("StyleCSS.css").toExternalForm());
        scene.setFill(Color.LIGHTGRAY);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Menu Access");
        stage.show();
    }
}
