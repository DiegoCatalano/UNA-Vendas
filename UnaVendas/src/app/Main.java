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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cli = new Cliente("nome", "123", 10);
        
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("caneta", 1, 10));
        produtos.add(new Produto("lapis", 0.8, 10));
        produtos.add(new Produto("caderno", 10, 10));
        
        List<ItemVenda> items = new ArrayList<>();
        Produto p = produtos.get(1);
        items.add(new ItemVenda(p, 3, p.getValor()));
        items.add(new ItemVenda(produtos.get(2), 1, produtos.get(2).getValor()));
        
        double sum = 0;
        for (ItemVenda item : items) {
            sum += item.getQuantidade() * item.getValorVendido();
        }
        
        //Venda realizada
        Venda venda = new Venda(cli, items, sum);
        
        produtos.get(1).setValor(100);
        List<ItemVenda> it = venda.getItemVendas();
        Produto prod = it.get(0).getProduto();
        System.out.println(prod.getDescricao());
        System.out.println(prod.getValor());
        System.out.println("Valor vendido: " + it.get(0).getValorVendido());
        
    }
    
}
