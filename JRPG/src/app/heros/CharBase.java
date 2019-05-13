/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.heros;

import app.armor.glove.GloveBase;
import app.armor.helmet.HelmetBase;

/**
 *
 * @author Diego
 */
public abstract class CharBase {
    
    protected double forca;
    protected double agilidade;
    protected double inteligencia;
    protected double hp;
    protected double mp;
    
    protected int level;
    protected double damageBase;
    protected double armorBase;
    
    protected HelmetBase helmet;
    protected GloveBase glove;

    //<editor-fold defaultstate="collapsed" desc="get;set">
    public double getForca() {
        return forca;
    }
    
    public void setForca(double forca) {
        this.forca = forca;
    }
    
    public double getAgilidade() {
        return agilidade;
    }
    
    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }
    
    public double getInteligencia() {
        return inteligencia;
    }
    
    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    public double getHp() {
        return hp;
    }
    
    public void setHp(double hp) {
        this.hp = hp;
    }
    
    public double getMp() {
        return mp;
    }
    
    public void setMp(double mp) {
        this.mp = mp;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
//</editor-fold>

    public CharBase(double forca, double agilidade, double inteligencia, double hp, double mp) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.hp = hp;
        this.mp = mp;
    }
    
    public void EquipHelmet(HelmetBase helmet){
        this.helmet = helmet;
        this.armorBase = helmet.getArmor();
    }
    
    public void EquipGlove(GloveBase gloves){
        
    }

    public abstract void LvlUp();
    
}
