/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Venda {
    
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private double valorTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Venda() {}

    public Venda(Cliente cliente, ArrayList<Produto> produtos, double valorTotal) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }
    
    
} 