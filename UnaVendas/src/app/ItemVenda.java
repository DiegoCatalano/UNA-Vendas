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
public class ItemVenda {
    
    private Produto produto;
    private int quantidade;
    private double valorVendido;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public ItemVenda(Produto produto, int quantidade, double valorVendido) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorVendido = valorVendido;
    }

    
    
}
