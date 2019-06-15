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
public class Lampada {
    
    private boolean ligado;
    private String cor;
    private float intensidade;

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

    public Lampada(boolean ligado, String cor, float intensidade) {
        this.ligado = ligado;
        this.cor = cor;
        this.intensidade = intensidade;
    }
    
    
    
}
