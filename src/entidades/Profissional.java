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
public class Profissional extends Pessoa{
    private int crefito;
    private String especialidade;

    public int getCrefito() {
        return crefito;
    }

    public void setCrefito(int crefito) {
        this.crefito = crefito;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
