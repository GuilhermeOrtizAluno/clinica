/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author a2058944
 */
public class Agendamento {
    private Date dataAgendamento;
    private int numSessao, formaPagto;
    private double valorCobrado;

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public int getNumSessao() {
        return numSessao;
    }

    public void setNumSessao(int numSessao) {
        this.numSessao = numSessao;
    }

    public int getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(int formaPagto) {
        this.formaPagto = formaPagto;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }
    
}
