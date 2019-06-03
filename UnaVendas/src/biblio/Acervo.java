/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

/**
 *
 * @author Diego
 */
public class Acervo {
    
    private Livro livro;
    private int quantidade;
    private String setor;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Acervo(Livro livro, int quantidade, String setor) {
        this.livro = livro;
        this.quantidade = quantidade;
        this.setor = setor;
    }
    
    
    
    
}
