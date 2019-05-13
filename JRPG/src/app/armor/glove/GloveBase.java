/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.armor.glove;

/**
 *
 * @author Diego
 */
public class GloveBase {
    
    protected double armor;

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public GloveBase(double armor) {
        this.armor = armor;
    }
   
    
}
