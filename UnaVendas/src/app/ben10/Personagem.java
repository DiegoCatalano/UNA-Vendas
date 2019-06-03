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
public class Personagem {
    
    private String nome;
    private double altura;
    private double peso;
    private double forca;
    private double agi;
    private double inte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getAgi() {
        return agi;
    }

    public void setAgi(double agi) {
        this.agi = agi;
    }

    public double getInte() {
        return inte;
    }

    public void setInte(double inte) {
        this.inte = inte;
    }

    public Personagem(String nome, double altura, double peso, double forca, double agi, double inte) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.forca = forca;
        this.agi = agi;
        this.inte = inte;
    }
    
    
    
}
