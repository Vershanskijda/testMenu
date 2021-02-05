import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.awt.*;
import java.io.File;


public class Controller {

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7;

    @FXML
    public void initialize() {

    }

    @FXML
    private void action1(ActionEvent event) {
        try {
            File file = new File("C:\\work\\Prog\\Otrabotano\\Otrabotano.accdb");
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void action2(ActionEvent event) {
        try {
            File file = new File("C:\\work\\Prog\\Peredacha\\Peredacha.accdb");
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void action3(ActionEvent event) {
        try {
            File file = new File("C:\\work\\Prog\\Vosvrat\\Vosvrat.accdb");
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void action4(ActionEvent event) {
        try {
            File file = new File("C:\\work\\Prog\\Zaprosy\\Zaprosy.accdb");
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void action5(ActionEvent event) {
        try {
            File file = new File("C:\\work\\Prog\\Sum3500\\Sum3500.accdb");
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void action6(ActionEvent event) {
        try {
            File file = new File("C:\\work\\Prog\\Podgruska\\Podgruska.accdb");
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void action7(ActionEvent event) {
        try {
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
