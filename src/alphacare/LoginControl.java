/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author James Chen
 */
public class LoginControl {
       @FXML 
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Text actiontarget;
    
    private PatientList theUserList; 
    private ArrayList<Patient> theUserArrayList; 
    private String enteredUsername; 
    private String enteredPassword; 
    
    @FXML //Method that runs when "Sign in" button is pressed
    protected void handleLoginButtonAction(ActionEvent e){
        theUserList = new PatientList();
        theUserArrayList = theUserList.getPatientList();
        enteredUsername = usernameField.getText();
        enteredPassword = passwordField.getText();
        
        for(int x = 0; x < theUserArrayList.size(); x++){ 
            if(enteredUsername.equals(theUserList.getUsername(x))){ 
                if(enteredPassword.equals(theUserList.getPassword(x))){
                    try{
                        //try block for nav UI we will develop later...
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("NavDocument.fxml"));
                        Parent root = (Parent)loader.load();
                        Stage stage = new Stage();
                        stage.setTitle("Alphacare");
                        stage.setScene(new Scene(root));
                        stage.show();
                    }catch(IOException ee){
                        ee.printStackTrace();
                    }
                    
                    Stage currentStage = (Stage) usernameField.getScene().getWindow();
                    currentStage.close();
                }
                else{
                    actiontarget.setText("Incorrect Password");//Displays an error message when the password entered does not match the password for the entered username
                    break; //Breaks the for loop so it doesn't loop again and find an incorrect username
                }
            }
            else{
                actiontarget.setText("Incorrect Username");//Displays an error message to the user in the case of a password that does not match any in the list
            }
        }
    }
    
}
