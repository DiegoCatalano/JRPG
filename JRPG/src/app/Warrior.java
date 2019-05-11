/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Diego
 */
public class Warrior extends CharBase{
    
    public Warrior(double forca, double agilidade, double inteligencia, double hp, double mp) {
        super(forca, agilidade, inteligencia, hp, mp);
    }

    @Override
    public void LvlUp() {
        this.forca *= 2;
        this.agilidade *= 1.1;
        this.inteligencia *= 1.01;
        this.hp += 250;
        this.mp += 30;
    }
    
    
    
}
