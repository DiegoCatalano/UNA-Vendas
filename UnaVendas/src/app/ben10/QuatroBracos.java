/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.ben10;

/**
 *
 * @author Diego
 */
public class QuatroBracos implements ITransformar{

    @Override
    public Personagem Transformar(Personagem personagem) {
        
        String nome = "Quatro Braços";
        double altura = personagem.getAltura() * 4;
        double peso = personagem.getPeso() * 4;
        double forca = personagem.getForca() * 5;
        double agi = personagem.getAgi() / 2;
        double inte = personagem.getInte() / 2;
        
        return new Personagem(nome, altura, peso, forca, agi, inte);
    }
    
}
