/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import java.util.List;

/**
 *
 * @author Diego
 */
public class Locacao {
    
    private Funcionario funcionario;
    private Pessoa pessoa;
    private List<ItemLivro> livros;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<ItemLivro> getLivros() {
        return livros;
    }

    public void setLivros(List<ItemLivro> livros) {
        this.livros = livros;
    }

    public Locacao(Funcionario funcionario, Pessoa pessoa, List<ItemLivro> livros) {
        this.funcionario = funcionario;
        this.pessoa = pessoa;
        this.livros = livros;
    }
    
    
    
}
