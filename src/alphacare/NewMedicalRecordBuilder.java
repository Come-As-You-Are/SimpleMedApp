/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinsonle
 */
public class NewMedicalRecordBuilder implements MedicalRecordBuilder{
    
    public MedicalRecord medicalRecord;
    
    public NewMedicalRecordBuilder(){
        this.medicalRecord = new MedicalRecord();
    }

    @Override
    public void buildMedicalRecordCreationDate() {
        Date date = new Date();
        this.medicalRecord.setLastUpdated(date);
        
    }

    @Override
    public void buildMedicalRecordUpdatedDate() {
        Date date = new Date();
        this.medicalRecord.setLastUpdated(date);
    }

    @Override
    public void buildMedicalRecordDescription() {
        String testBuilder = "test";
        this.medicalRecord.setMedicalRecordDescription(testBuilder);
    }

    @Override
    public void buildMedicalRecordMeds() {
        ArrayList<Medicine> meds = new ArrayList();
        this.medicalRecord.setMedicalRecordMeds(meds);
    }

    @Override
    public void buildMedicalRecordVacs() {
        ArrayList<Vaccine> vacs1 = new ArrayList();
        vacs1.add(new Vaccine ("Flu"));
        vacs1.add(new Vaccine ("MMR")); //Measles, Mumps, Rubella
        vacs1.add(new Vaccine ("Tetanus"));
        vacs1.add(new Vaccine ("Chickenpox"));
        this.medicalRecord.setMedicalRecordVacs(vacs1);
    }
    
    @Override
    public MedicalRecord getMedicalRecord()
    {
        return this.medicalRecord;
    }
}
