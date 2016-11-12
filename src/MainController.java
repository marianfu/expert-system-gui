import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * Main controller class for the entire layout.
 */
public class MainController {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    /** Holder of a switchable vista. */
    @FXML
    private StackPane vistaHolder;

    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void setVista(Node node) {
        vistaHolder.getChildren().setAll(node);
    }

    public void showNextPane(ActionEvent event) {
        if (event.getSource() == button1) {
            VistaNavigator.loadVista(VistaNavigator.VISTA_2);
        }
        if (event.getSource() == button2) {
            VistaNavigator.loadVista(VistaNavigator.VISTA_1);

        }
    }

}