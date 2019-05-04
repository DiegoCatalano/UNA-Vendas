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
public class Produto {
    
    private String descricao;
    private double valor;
    private int qtdEstoque;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Produto() {
    }

    public Produto(String descricao, double valor, int qtdEstoque) {
        this.descricao = descricao;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }
    
    
    
    
}
