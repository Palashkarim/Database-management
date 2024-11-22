/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button signUpButtonOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        userTypeComboBox.getItems().addAll(
                "Ambassador", "Cultural Attache", "Visa Applicant", "Visa Officer",
                "Translator", "security specialist", "Local Citizen", "Foreign Dignitary"
        );
    }    

    @FXML
    private void logInButtonOnClick(ActionEvent event) throws IOException {
        int userId;
        String pass_str;
        userId = Integer.parseInt(idTextField.getText());
        pass_str = passwordTextField.getText();
        if ((userId == 2110492) && pass_str.equals("1234") && userTypeComboBox.getValue().equals("Ambassador")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("Ambassador.fxml"));
            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stg.setScene(scene);
            stg.show();
        } 
        else if ((userId == 2110492) && pass_str.equals("1234") && userTypeComboBox.getValue().equals("Cultural Attache")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("CulturalAttache.fxml"));
            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stg.setScene(scene);
            stg.show();
        } 
        
        
        
    }
    
        
    
    
}
