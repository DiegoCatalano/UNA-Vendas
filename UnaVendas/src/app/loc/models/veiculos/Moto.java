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
public class Moto extends Veiculo{

    public Moto(String cor, int cap, double pot) {
        super(cor, cap, pot);
    }

    @Override
    public String getTipo() {
        return "Aereo";
    }
    
    
    
}
