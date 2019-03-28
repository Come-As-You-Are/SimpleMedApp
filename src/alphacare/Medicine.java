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
public class Medicine {
     
    private String name;
    private String description;
    private ArrayList<String> sideEffects;
    
    /**
     * This is the default constructor for the Medicine class.
     * @param name The name of the medicine.
     */
    public Medicine(String name) {
        this.name = name;
        this.description = "No description entered";
        this.sideEffects = new ArrayList();
    }
    
    public Medicine(String name, String description, ArrayList<String> sideEffects)
    {
        this.name = name;
        this.description = description;
        this.sideEffects = sideEffects;
    }
    
     /**
     * Gets the medicine name.
     * @return A string representing the medicine name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the medicine name.
     * @param name A String representing the new medicine name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the medicine description.
     * @return A string representing the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the medicine description.
     * @param description A string representing the new description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the medicine side effects.
     * @return An ArrayList of Strings representing side effects.
     */
    public ArrayList<String> getSideEffects() {
        return sideEffects;
    }
    
    /**
     * Sets the medicine side effects.
     * @param sideEffects An ArrayList of Strings representing side effects.
     */
    public void setSideEffects(ArrayList<String> sideEffects) {
        this.sideEffects = sideEffects;
    }
    
    /**
     * Adds a side effect to the ArrayList of side effects.
     * @param se A string representing the side effect to be added.
     */
    public void addSideEffect(String se) {
        sideEffects.add(se);
    }
    
    /**
     * Removes a side effect from the ArrayList of side effects.
     * @param se A string representing the side effect to be removed.
     */
    public void removeSideEffect(String se) {
        sideEffects.remove(se);
    }
}

