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
public class  Cliente extends Pessoa {
    
    private String matricula;
    private boolean especial;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    public Cliente(String matricula, String nome, String cpf, Date nascimento) {
        super(nome, cpf, nascimento);
        this.matricula = matricula;
        this.especial = false;
    }

    public Cliente(String matricula, boolean especial, String nome, String cpf, Date nscimento) {
        super(nome, cpf, nscimento);
        this.matricula = matricula;
        this.especial = especial;
    }
    
    

    
    
    
    
}
