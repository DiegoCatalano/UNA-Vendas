/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class Funcionario extends Pessoa{
    
    private Date dataInicio;
    private double salario;

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(Date dataInicio, double salario, String nome, String cpf, Date nscimento) {
        super(nome, cpf, nscimento);
        this.dataInicio = dataInicio;
        this.salario = salario;
    }
    
    
    
}
