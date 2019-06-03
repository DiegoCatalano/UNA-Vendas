/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.loc.models.veiculos;

import app.loc.models.pessoa.*;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class Funcionario extends Pessoa{
    
    private double sal;
    private Date data;

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    

    public Funcionario(double sal, Date data, String nome, String cpf, String end) {
        super(nome, cpf, end);
        this.sal = sal;
        this.data = data;
    }
    
    
    
}
