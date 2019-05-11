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
public class CharBase implements IUp{
    
    protected double forca;
    protected double agilidade;
    protected double inteligencia;
    protected double hp;
    protected double mp;

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

    public CharBase(double forca, double agilidade, double inteligencia, double hp, double mp) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public void LvlUp() {
        this.forca *= 1.2;
        this.agilidade *= 1.2;
        this.inteligencia *= 1.2;
        
    }
    
}
