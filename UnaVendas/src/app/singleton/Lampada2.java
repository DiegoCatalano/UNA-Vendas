/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.singleton;

/**
 *
 * @author Diego
 */
public class Lampada2 {
    
    private boolean ligado;
    private String cor;
    private float intensidade;
    private static Lampada2 lamp;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(float intensidade) {
        this.intensidade = intensidade;
    }

    private Lampada2(){}
    
    public static Lampada2 getInstance(){
        
        lamp = new Lampada2();
        lamp.setIntensidade(1f);
        lamp.setLigado(false);
        lamp.setCor("Neutro");
        
        return lamp;
        
    }
    
    
    
}
