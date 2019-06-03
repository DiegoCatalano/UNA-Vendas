/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.loc.models.veiculos;

/**
 *
 * @author Diego
 */
public abstract class Veiculo {
    
    private String cor;
    private int cap;
    private double pot;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public double getPot() {
        return pot;
    }

    public void setPot(double pot) {
        this.pot = pot;
    }
    
    public abstract String getTipo();

    public Veiculo(String cor, int cap, double pot) {
        this.cor = cor;
        this.cap = cap;
        this.pot = pot;
    }
    
    
    
}
