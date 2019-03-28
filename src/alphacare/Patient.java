/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 *
 * @author James Chen
 */
public class Patient {
     private  String username;
    private  String password;
    
    public Patient(String newUsername, String newPassword){ 
        this.username = newUsername;
        this.password = newPassword;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    
}
