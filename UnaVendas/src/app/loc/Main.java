/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.loc;

import app.loc.models.veiculos.Jipe;
import app.loc.models.veiculos.Moto;
import app.loc.models.veiculos.Veiculo;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo v = new Jipe("", 10, 10);
        System.out.println(v.getTipo());
    }
    
}
