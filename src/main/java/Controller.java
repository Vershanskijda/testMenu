import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Controller {

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7;

    @FXML
    Text text1, text2;

    @FXML
    public void initialize() {
        Font.loadFont(Solution.class.getClassLoader().getResourceAsStream( "Times New Roman.ttf"), 30);
    }

    @FXML
    private void action1(ActionEvent event) {
        openFile("C:\\work\\Prog\\Otrabotano\\Otrabotano.accdb");
    }

    @FXML
    private void action2(ActionEvent event) {
        openFile("C:\\work\\Prog\\Peredacha\\Peredacha.accdb");
    }

    @FXML
    private void action3(ActionEvent event) {
        openFile("C:\\work\\Prog\\Vosvrat\\Vosvrat.accdb");
    }

    @FXML
    private void action4(ActionEvent event) {
        openFile("C:\\work\\Prog\\Zaprosy\\Zaprosy.accdb");
    }

    @FXML
    private void action5(ActionEvent event) {
        openFile("C:\\work\\Prog\\Sum3500\\Sum3500.accdb");
    }

    @FXML
    private void action6(ActionEvent event) {
        openFile("C:\\work\\Prog\\Podgruska\\Podgruska.accdb");
    }

    @FXML
    private void action7(ActionEvent event) {
        try {
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openFile(String path) {
        try {
            File file = new File(path);
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            showError(e.getMessage());
        }
    }


    public void showError(String textError) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ErrorFXML.fxml"));
            Parent root = loader.load();
            Controller controller = loader.getController();
            controller.text2.setText(textError);

            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("ErrorStyleCSS.css").toExternalForm());
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setScene(scene);
            window.setTitle("Error");
            window.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
