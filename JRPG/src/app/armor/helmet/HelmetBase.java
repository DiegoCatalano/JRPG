/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.armor.helmet;

/**
 *
 * @author Diego
 */
public class HelmetBase {
    
    protected double armor;

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public HelmetBase(double armor) {
        this.armor = armor;
    }
   
    
}
