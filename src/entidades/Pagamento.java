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
public interface Pagamento {
    public final int 
            CERTAO_CREDITO = 1,
            DINHEIRO = 2,
            BOLETO = 3,
            DEPOSITO = 4,
            CONVENIO = 5
    ;
    public void selecionarPagamento(int tipo);
}
