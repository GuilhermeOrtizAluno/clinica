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
public class Agendamento implements Pagamento{
    private Date dataAgendamento;
    private int numSessao, formaPagto;
    private double valorCobrado;
    private Procedimentos procedimentos;  

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
    
    @Override
    public void selecionarPagamento(int tipo) {
        double valor = procedimentos.getValor();
        switch(tipo){   
            case 1:
                valorCobrado = valor * 1.005;
            break;
            case 2:
            
            break;
            case 3:
            
            break;
            case 4:
            
            break;
            case 5:
            
            break;
            default: System.out.println("Erro69!"); 
        }
    }
}
