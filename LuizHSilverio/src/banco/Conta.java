/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author luizh
 */
public class Conta {
    String cliente;
    double saldo;
    double limite;
    
    public void deposita(double deposito) {
        this.saldo += deposito;
        System.out.println("Deposito efetuado com sucesso.");
    }
}
