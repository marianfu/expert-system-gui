import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Controller class for the second vista.
 */
public class CreatePredictionController {

    /**
     * Event handler fired when the user requests a previous vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void predict(ActionEvent event) {
        VistaNavigator.loadVista(VistaNavigator.CREATE_PATIENT_VIEW);
    }

}