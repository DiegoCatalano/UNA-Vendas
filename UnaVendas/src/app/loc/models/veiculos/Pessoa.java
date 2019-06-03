/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.loc.models.veiculos;

import app.loc.models.pessoa.*;

/**
 *
 * @author Diego
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String end;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Pessoa(String nome, String cpf, String end) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
    }
    
    
}
