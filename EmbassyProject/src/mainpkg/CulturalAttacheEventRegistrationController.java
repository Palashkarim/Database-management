/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CulturalAttacheEventRegistrationController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private TableView<String> tableView;
    @FXML
    private TableColumn<?, ?> nameTableView;
    @FXML
    private TableColumn<?, ?> dobTableView;
    @FXML
    private TableColumn<?, ?> genderTableView;
    @FXML
    private RadioButton maleRbutton;
    @FXML
    private RadioButton otherRButton;
    @FXML
    private RadioButton femaleRbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void showParticipantButtonOnClick(ActionEvent event) {
    }
    
}
