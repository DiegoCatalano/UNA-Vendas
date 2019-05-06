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
    private List<ItemVenda> itemVendas;
    private double valorTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItemVendas() {
        return itemVendas;
    }

    public void setItemVendas(List<ItemVenda> itemVendas) {
        this.itemVendas = itemVendas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Venda(Cliente cliente, List<ItemVenda> itemVendas, double valorTotal) {
        this.cliente = cliente;
        this.itemVendas = itemVendas;
        this.valorTotal = valorTotal;
    }
    
    
} 