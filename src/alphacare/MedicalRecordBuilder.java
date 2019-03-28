/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;


/**
 *
/**
 *
 * @author vinsonle
 */
public interface MedicalRecordBuilder {
    
     //This interface is the "plan" for what and how the attributes will be built
    
    public void buildMedicalRecordCreationDate();
    public void buildMedicalRecordUpdatedDate();
    public void buildMedicalRecordDescription();
    public void buildMedicalRecordMeds();
    public void buildMedicalRecordVacs();
    
    public MedicalRecord getMedicalRecord();
    
}