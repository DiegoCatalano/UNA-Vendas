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
public class Pessoa {
    
    private String nome;
    private String cpf;
    private Date nscimento;

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

    public Date getNscimento() {
        return nscimento;
    }

    public void setNscimento(Date nscimento) {
        this.nscimento = nscimento;
    }

    public Pessoa(String nome, String cpf, Date nscimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nscimento = nscimento;
    }
    
    
    
    
}
