/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.armor.helmet.IronHelmet;
import app.heros.Warrior;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Warrior w = new Warrior(1, 1, 1, 1, 1);
        w.LvlUp();
        w.EquipHelmet(new IronHelmet(0));
        
        double forca = w.getForca();
        System.out.println(forca);
        
    }
    
}
