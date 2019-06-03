/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.loc.models.veiculos;

import app.Cliente;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class Locacao {
    
    private Funcionario func;
    private Cliente cli;
    private Veiculo veiculo;
    private Date dataInicio;

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Locacao(Funcionario func, Cliente cli, Veiculo veiculo, Date dataInicio) {
        this.func = func;
        this.cli = cli;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
    }
    
    
    
}
