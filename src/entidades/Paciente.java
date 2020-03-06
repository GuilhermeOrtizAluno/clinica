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
public class Paciente extends Pessoa{
    private int convenio;
    private String numeroCarterinha;

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public String getNumeroCarterinha() {
        return numeroCarterinha;
    }

    public void setNumeroCarterinha(String numeroCarterinha) {
        this.numeroCarterinha = numeroCarterinha;
    }
    
}
