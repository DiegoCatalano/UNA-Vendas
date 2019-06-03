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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personagem p = new Personagem("Ben 10", 10, 10, 10, 10, 10);
        
        ITransformar qb = new QuatroBracos();
        Personagem alien = qb.Transformar(p);
        
        System.out.println(p.getAltura());
        System.out.println(alien.getAltura());
        
    }
    
}
