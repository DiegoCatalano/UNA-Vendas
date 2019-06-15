/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import java.util.ArrayList;
import java.util.Arrays;
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
        
        Cliente cli1 = new Cliente("01", "fulano", "123", new Date());
        Cliente cli2 = new Cliente("10", "beltrano", "243", new Date());
        Cliente cli3 = new Cliente("20", "deltrano", "547", new Date());
        
        List<Cliente> lst = new ArrayList<>();
        lst.add(cli1);
        lst.add(cli3);
        
        
        int stop = 0;
    }
    
}
