/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author vinsonle
 */
public class NavControl implements Initializable {

    @FXML
    private Text name;
    @FXML
    private Text age;
    @FXML
    private Text weight;
    @FXML
    private Text height;
    @FXML
    private Button editProfileButton;
    @FXML
    private Text vacTetanus;
    @FXML
    private Text doa1;
    @FXML
    private Text vacChicken;
    @FXML
    private Text doa2;
    @FXML
    private Text vacFlu;
    @FXML
    private Text vacMMR;
    @FXML
    private Text doa3;
    @FXML
    private Text doa4;
    @FXML
    private Text visit;
    @FXML
    private Button homeButton;
    @FXML
    private TableColumn<?, ?> date;
    @FXML
    private TableColumn<?, ?> doctor;
    @FXML
    private TableColumn<?, ?> description;
    
    
    
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void testBuilderTwo(ActionEvent event) {
        Appointment_1 rw = new Appointment_1();
         rw.setVisible(true);

    }

    @FXML
    private void testBuilderOne(ActionEvent event) {
        
        MedicalRecordBuilder newMedicalRecord = new NewMedicalRecordBuilder(); //First define the type of MedicalRecord blueprint that I want created
        
        MedicalRecordEngineer recordEngineer = new MedicalRecordEngineer(newMedicalRecord); //tell the Medical Record engineer what type of blueprint is being used 
        
        recordEngineer.makeMedicalRecord(); //make the medical record based on the blueprint
        
        MedicalRecord firstMedicalRecord = recordEngineer.getMedicalRecord(); //get the medical record
        
        System.out.println("Medical Record Created: " + firstMedicalRecord.getCreation() + 
                "Medical Record Updated: " + firstMedicalRecord.getLastUpdated() +
                "Medical Record Vacs: " + firstMedicalRecord.getVacs() +
                "Medical Record Meds: " + firstMedicalRecord.getMeds() +
                "Medical Record Description: " + firstMedicalRecord.getRecordDescription());
    }

    
    
}
