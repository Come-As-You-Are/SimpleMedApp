/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.ArrayList;

/**
 *
 * @author James Chen
 */
public class PatientList {
       private ArrayList<Patient> thePatientList = new ArrayList<>(); 
    
    public PatientList(){
       
        createTestPatientList();
    }
    
    public void createTestPatientList(){ //Method for creating a set of test users
        thePatientList.add(new Patient("User", "Password"));
        thePatientList .add(new Patient("testUser02", "testPassword02"));
        thePatientList .add(new Patient("testUser03", "testPassword03"));
        thePatientList .add(new Patient("testUser04", "testPassword04"));
        thePatientList .add(new Patient("testUser05", "testPassword05"));
    }
    
    public ArrayList<Patient> getPatientList(){
        return thePatientList; 
    }
    
    public String getUsername(int index){
        return thePatientList.get(index).getUsername();
       
    }
    
    public String getPassword(int index){ 
        return thePatientList.get(index).getPassword();
    }
    
}
