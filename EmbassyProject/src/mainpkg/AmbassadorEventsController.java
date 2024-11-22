package mainpkg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mainpkg.Event;

public class AmbassadorEventsController implements Initializable {

    @FXML
    private TextField eventNameTextfiled;
    @FXML
    private DatePicker dobfield;
    @FXML
    private TextField locationTextField;
    @FXML
    private TextField timeTextfield;
    private List<Event> eventList = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createButtonOnClick(ActionEvent event) {
        
        String eventName= eventNameTextfiled.getText();
        String location=locationTextField.getText();
        Integer time=Integer.parseInt(timeTextfield.getText());
        
        Event newEvent = new Event(eventName, location, time);
        
        eventList.add(newEvent);

        // Save events to a binary file
        saveEventsToFile();

        // Clear input fields or update UI as needed
        eventNameTextfiled.clear();
        locationTextField.clear();
    }

    // Method to save events to a binary file
    private void saveEventsToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("events.bin"))) {
            outputStream.writeObject(eventList);
            System.out.println("Events saved to file successfully.");
        } catch (IOException e) {
            System.err.println("Error saving events to file: " + e.getMessage());
        }
    }

    @FXML
    private void backButtton(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Ambassador.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
    }
}
