/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;


import java.util.ArrayList;

/**
 *
 * @author vinsonle
 */

//focus of this class is to create medicine objects by decoupling the setters allowing the creation of objects
//without worrying about complex constructors

public class MedicineBuilder {
    
    private String name;
    private String description;
    private ArrayList<String> sideEffects;
    
    public MedicineBuilder setName(String name)
    {
        this.name = name;
        return this;
    }
    
    public MedicineBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }
    
    public MedicineBuilder setSideEffects(ArrayList<String> sideEffects)
    {
        this.sideEffects = sideEffects;
        return this;
    }
    
    public Medicine getMedicine()
    {
        return new Medicine(name, description, sideEffects);
    }
    
}
