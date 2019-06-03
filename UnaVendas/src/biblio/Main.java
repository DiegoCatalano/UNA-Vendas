/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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
        
        Cliente cli = new Cliente("01", "fulano", "123", new Date());
        Funcionario fun = new Funcionario(new Date(), 10, "fun", "123", new Date());
        
        Livro l1 = new Livro(0, "titulo", "autor", "ed");
        
        ItemLivro l = new ItemLivro(l1);
        
        List<ItemLivro> livros = new ArrayList<>();
        livros.add(l);
        
        Locacao loc = new Locacao(fun,cli, livros);
        
        Pessoa p1 = new Cliente(null,null,null,null);
        Pessoa p2 = new Funcionario(null,0,null,null,null);
        
        
        
    }
    
}
