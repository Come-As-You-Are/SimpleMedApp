/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 *
 * @author vinsonle
 */
public class MedicalRecordEngineer {
     
    private MedicalRecordBuilder medicalRecordBuilder;
    
    //This Engineer class is responsible for creating the actual MedicalRecord
    //The class accepts a builder class as a constructor, then can build it using the makeMedicalRecord method
    
    public MedicalRecordEngineer(MedicalRecordBuilder medicalRecordBuilder) 
    {
        this.medicalRecordBuilder = medicalRecordBuilder;
    }

    
    public MedicalRecord getMedicalRecord()
    {
        return this.medicalRecordBuilder.getMedicalRecord();
    }
    
    public void makeMedicalRecord()
    {
        this.medicalRecordBuilder.buildMedicalRecordCreationDate();
        this.medicalRecordBuilder.buildMedicalRecordDescription();
        this.medicalRecordBuilder.buildMedicalRecordMeds();
        this.medicalRecordBuilder.buildMedicalRecordUpdatedDate();
        this.medicalRecordBuilder.buildMedicalRecordVacs();
    }
    
}
