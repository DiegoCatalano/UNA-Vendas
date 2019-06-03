/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class ItemLivro {
    
    private Livro livro;
    private int nRenovacoes;
    private Date dataInicial;
    private Date dataEntrega;
    private Date dataEfetuada;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getnRenovacoes() {
        return nRenovacoes;
    }

    public void setnRenovacoes(int nRenovacoes) {
        this.nRenovacoes = nRenovacoes;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataEfetuada() {
        return dataEfetuada;
    }

    public void setDataEfetuada(Date dataEfetuada) {
        this.dataEfetuada = dataEfetuada;
    }
    
    public ItemLivro(Livro livro){
        this.livro = livro;
        dataInicial = new Date();
        dataEntrega = new Date();
        dataEfetuada = null;
    }

    public ItemLivro(Livro livro, int nRenovacoes, Date dataInicial, Date dataEntrega, Date dataEfetuada) {
        this.livro = livro;
        this.nRenovacoes = nRenovacoes;
        this.dataInicial = dataInicial;
        this.dataEntrega = dataEntrega;
        this.dataEfetuada = dataEfetuada;
    }
    
    
            
}
