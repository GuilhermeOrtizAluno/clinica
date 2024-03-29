/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author a2058944
 */
public class Procedimentos{
    private int codigo, numSessoes;
    private double valor;
    private String descricao;
    private StringBuffer orientacoes;

    public Procedimentos(int codigo, int numSessoes, double valor, String descricao, StringBuffer orientacoes) {
        this.codigo = codigo;
        this.numSessoes = numSessoes;
        this.valor = valor;
        this.descricao = descricao;
        this.orientacoes = orientacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumSessoes() {
        return numSessoes;
    }

    public void setNumSessoes(int numSessoes) {
        this.numSessoes = numSessoes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StringBuffer getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(StringBuffer orientacoes) {
        this.orientacoes = orientacoes;
    }
    
}
